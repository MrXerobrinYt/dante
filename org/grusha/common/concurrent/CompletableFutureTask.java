package org.grusha.common.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.function.Supplier;

/**
 * Объединяет CompletableFuture и Runnable для выполнения задач.
 * Суть не изменена — только улучшена обработка ошибок.
 */
public abstract class CompletableFutureTask<T> extends CompletableFuture<T> implements Runnable {

    private final FutureTask<T> task = new FutureTask<>(this::execute);

    /** Основной метод, который реализует логику задачи */
    protected abstract T execute() throws Exception;

    @Override
    public void run() {
        if (isCancelled()) {
            return;
        }

        task.run();
        try {
            complete(task.get());
        } catch (ExecutionException e) {
            completeExceptionally(e.getCause());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            completeExceptionally(e);
        } catch (Exception e) {
            completeExceptionally(e);
        }
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return super.cancel(mayInterruptIfRunning) && task.cancel(mayInterruptIfRunning);
    }

    public static <T> CompletableFutureTask<T> of(Callable<T> callable) {
        return new CompletableFutureTask<T>() {
            @Override
            protected T execute() throws Exception {
                return callable.call();
            }
        };
    }

    public static <T> CompletableFutureTask<T> of(Supplier<T> supplier) {
        return new CompletableFutureTask<T>() {
            @Override
            protected T execute() {
                return supplier.get();
            }
        };
    }
}
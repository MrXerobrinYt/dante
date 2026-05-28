package org.grusha.common.util;

/**
 * Интерфейс для объектов, которые требуют явной инициализации.
 * Суть не изменена.
 */
public interface Initializable {

    /** Выполняет инициализацию объекта. */
    void initialization();

    /** @return true если объект уже инициализирован */
    boolean isInitialized();
}
/*
 * Decompiled with CFR 0.152.
 */
package org.grusha.common.io;

public interface Deserializer<T> {
    public void deserialize(T var1) throws Exception;

    default public boolean safeDeserialize(T in) {
        try {
            this.deserialize(in);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}


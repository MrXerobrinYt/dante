/*
 * Decompiled with CFR 0.152.
 */
package org.grusha.common.io;

public interface Serializer<T> {
    public void serialize(T var1) throws Exception;

    default public boolean safeSerialize(T out) {
        try {
            this.serialize(out);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}


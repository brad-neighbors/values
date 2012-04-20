package com.incandescent.value;

import static org.apache.commons.lang.Validate.notNull;

public abstract class Value<T> {

    protected T value;

    protected Value(T value) {
        notNull(value, "Value cannot be null.");
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object candidate) {
        if (this == candidate) return true;
        if (candidate == null || getClass() != candidate.getClass()) return false;

        final Value thatVal = (Value) candidate;
        return this.value.equals(thatVal.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}

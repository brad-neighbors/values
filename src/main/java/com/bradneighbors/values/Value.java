package com.bradneighbors.values;

import static org.apache.commons.lang.Validate.notNull;

/**
 * Specifies a common Value superclass for all value objects.
 *
 * @param <T> the value encapsulated by the Value object subclass
 */
public abstract class Value<T> {

  protected T value;

  /**
   * @param value the non-null value encapsulated
   * @throws IllegalArgumentException if the value is <code>null</code>
   */
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

  /**
   * @return The encapsulated value.
   */
  public T val() {
    return value;
  }

  @Override
  public int hashCode() {
    return value != null ? value.hashCode() : 0;
  }
}

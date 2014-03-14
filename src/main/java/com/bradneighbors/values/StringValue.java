package com.bradneighbors.values;

import static org.apache.commons.lang.Validate.notEmpty;

/**
 * Encapsulates all string values.
 */
public abstract class StringValue extends Value<String> {

  /**
   * @param value the non-empty string value
   * @throws IllegalArgumentException If the value is empty.
   */
  protected StringValue(String value) {
    super(value);
    notEmpty(value, "String value for value object cannot be empty.");
  }
}

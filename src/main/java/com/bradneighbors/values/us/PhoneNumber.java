package com.bradneighbors.values.us;

import com.bradneighbors.values.StringValue;

/**
 * Represents a 10 digit phone number in the United States.
 */
public class PhoneNumber extends StringValue {

  /**
   * @param value the phone number value
   * @throws IllegalArgumentException If (after stripping all spaces, parentheses, and dashes) the value is not valid format.
   */
  protected PhoneNumber(String value) {
    super(value);
    final String strippedVal = value.replace(" ", "").replace("(", "").replace(")", "").replace("-", "").trim();
    if (!strippedVal.matches("\\d{10}?")) {
      throw new IllegalArgumentException("Not a valid American phone number.");
    }
    super.value = strippedVal;
  }
}

package com.bradneighbors.values.us;

import com.bradneighbors.values.StringValue;

/**
 * A United States Social Security Number.
 */
public class Ssn extends StringValue {

  /**
   * @param value the ssn value
   * @throws IllegalArgumentException If the supplied value does not conform to SSN validation.
   */
  public Ssn(String value) {
    super(value);
    final String strippedVal = value.replace(" ", "").replace("-", "").trim();
    if (!strippedVal.matches("\\d{9}?")) {
      throw new IllegalArgumentException("Not a valid American Social Security Number.");
    }
    super.value = strippedVal;
  }

  /**
   * Represents the ssn with dashes commonly seen like 000-00-0000.
   * @return The Social Security Number with dashes.
   */
  public String dashed() {
    return dividedBy("-");
  }

  /**
   * Represents the ssn with spaces commonly seen like 000 00 0000.
   * @return The Social Security Number with spaces.
   */
  public String spaced() {
    return dividedBy(" ");
  }

  private String dividedBy(final String breakChar) {
    return value.substring(0, 3) + breakChar + value.substring(3, 5) + breakChar + value.substring(5, 9);
  }
}

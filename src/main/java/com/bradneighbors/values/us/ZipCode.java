package com.bradneighbors.values.us;

import com.bradneighbors.values.StringValue;

import java.util.regex.Pattern;

/**
 * Represents a Zip code in the United States.
 */
public class ZipCode extends StringValue {

  private static final Pattern zipCodePattern = Pattern.compile("\\d{5}(-\\d{4})?");

  /**
   * @param value the zip code (of format 12345-1234)
   * @throws IllegalArgumentException If the value does not conform to the specified format.
   */
  public ZipCode(String value) {
    super(value);
    if (!value.matches(zipCodePattern.pattern())) {
      throw new IllegalArgumentException("Not a valid American zip code.");
    }
  }
}

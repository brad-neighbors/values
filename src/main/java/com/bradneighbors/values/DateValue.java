package com.bradneighbors.values;

import java.util.Date;

/**
 * Represents a date.
 */
public class DateValue extends Value<Date> {

  /**
   * @param date the non-null date.
   * @throws IllegalArgumentException if the value is <code>null</code>
   */
  protected DateValue(Date date) {
    super(date);
  }
}

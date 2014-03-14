package com.bradneighbors.values;

import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;

public class PrimitiveTypeValuesTest {

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void shortValuesCannotBeNull() {
    new PrimitiveTypeValueSamples.FriendCountShort(null);
  }

  @Test
  public void shortValue() {
    Short actualValue = Short.valueOf("1");
    assertEquals(new PrimitiveTypeValueSamples.FriendCountShort(actualValue).val(), actualValue);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void dateValuesCannotBeNull() {
    new PrimitiveTypeValueSamples.Birthday(null);
  }

  @Test
  public void dateValue() {
    Date actualDate = new Date();
    assertEquals(actualDate, new PrimitiveTypeValueSamples.Birthday(actualDate).val());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void floatValuesCannotBeNull() {
    new PrimitiveTypeValueSamples.TemperatureFloat(null);
  }

  @Test
  public void floatValue() {
    Float bodyTemp = Float.valueOf("98.6");
    assertEquals(bodyTemp, new PrimitiveTypeValueSamples.TemperatureFloat(bodyTemp).val());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void integerValuesCannotBeNull() {
    new PrimitiveTypeValueSamples.UserCountInteger(null);
  }

  @Test
  public void integerValue() {
    Integer actualCount = Integer.valueOf("123");
    assertEquals(actualCount, new PrimitiveTypeValueSamples.UserCountInteger(actualCount).val());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void byteValuesCannotBeNull() {
    new PrimitiveTypeValueSamples.SmallThingByte(null);
  }

  @Test
  public void byteValue() {
    Byte actualByte = Byte.valueOf("8");
    assertEquals(actualByte, new PrimitiveTypeValueSamples.SmallThingByte(actualByte).val());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void longValuesCannotBeNull() {
    new PrimitiveTypeValueSamples.UserCountLong(null);
  }

  @Test
  public void longValue() {
    Long actualValue = Long.valueOf("1234");
    assertEquals(actualValue, new PrimitiveTypeValueSamples.UserCountLong(actualValue).val());
  }
}

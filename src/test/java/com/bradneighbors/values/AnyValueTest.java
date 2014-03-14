package com.bradneighbors.values;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class AnyValueTest {

  @Test
  public void equalWhenValuesEqual() {
    assertTrue("Equal when values equal", new ExampleStringVal("foo").equals(new ExampleStringVal("foo")));
    assertFalse("Not equal when values differ", new ExampleStringVal("foo").equals(new ExampleStringVal("bar")));
  }

  @Test
  public void canBeItemsInSet() {
    // tests that hashCode() is working correctly
    Set<ExampleLongValue> longValSet = new HashSet<>();
    assertTrue(longValSet.add(new ExampleLongValue(1L)));
    assertFalse("Cannot add same value to set", longValSet.add(new ExampleLongValue(1L)));
    assertTrue(longValSet.add(new ExampleLongValue(2L)));
    assertEquals(2, longValSet.size());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void valueCannotBeNull() {
    new ExampleLongValue(null);
  }

  @Test
  public void toStringReturnsValueToString() {
    String actualValue = "Joe";
    assertEquals(actualValue, new ExampleStringVal(actualValue).toString());
  }

  private static class ExampleStringVal extends Value<String> {

    public ExampleStringVal(String value) {
      super(value);
    }
  }

  private static class ExampleLongValue extends Value<Long> {

    private ExampleLongValue(Long value) {
      super(value);
    }
  }

}

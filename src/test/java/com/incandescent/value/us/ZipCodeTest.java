package com.incandescent.value.us;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class ZipCodeTest {

    @Test
    public void firstSectionMustBeFiveDigits() {
        try {
            new ZipCode("123456-1234");
            fail("123456-1234 not a valid zip because first section has too many digits (needs 5)");
        } catch (IllegalArgumentException iae) {}

        try {
            new ZipCode("1234-1234");
            fail("1234-1234 not a valid zip because first section has too few digits (needs 5)");
        } catch (IllegalArgumentException iae) {}
    }

    @Test
    public void canBeEitherFiveDigitsOrFiveDashFour() {
        assertEquals("94114-0001", new ZipCode("94114-0001").val());
        assertEquals("94114", new ZipCode("94114").val());
    }

    @Test
    public void secondSectionMustBeFourDigits() {
        try {
            new ZipCode("12345-123");
            fail("12345-123 not a valid zip because second section has too few digits (needs 4)");
        } catch (IllegalArgumentException iae) {}

        try {
            new ZipCode("12345-12345");
            fail("12345-12345 not a valid zip because second section has too many digits (needs 4)");
        } catch (IllegalArgumentException iae) {}
    }
}

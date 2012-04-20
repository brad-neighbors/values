package com.incandescent.value.us;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class SsnTest {

    @Test
    public void mustBe9Digits() {
        try {
            new Ssn("1234567890");
            fail("Should have failed creating ssn with too many digits.");
        } catch (IllegalArgumentException iae) {}

        try {
            new Ssn("12345678");
            fail("Should have failed creating ssn with too few digits.");
        } catch (IllegalArgumentException iae) {}

        assertEquals("123456789", new Ssn("123456789").val());
    }

    @Test
    public void commonlySpecifiedWithDashes() {
        assertEquals("123456789", new Ssn("123-45-6789").val());
    }

    @Test
    public void commonlySpecifiedWithSpaces() {
        assertEquals("123456789", new Ssn("123 45 6789").val());
    }

    @Test
    public void canRenderedWithDashes() {
        assertEquals("123-45-6789", new Ssn("123456789").dashed());
    }

    @Test
    public void canRenderedWithSpaces() {
        assertEquals("123 45 6789", new Ssn("123456789").spaced());
    }
}

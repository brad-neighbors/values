package com.incandescent.value.usa;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class PhoneNumberTest {

    @Test
    public void mustBe10digitsLong() {
        assertEquals("4153367222", new PhoneNumber("4153367222").val());
        try {
            new PhoneNumber("123456789");
            fail("Should not have built phone number with less than 10 digits");
        } catch (IllegalArgumentException iae){}

        try {
            new PhoneNumber("12345678901");
            fail("Should not have built phone number with more than 10 digits");
        } catch (IllegalArgumentException iae){}
    }

    @Test
    public void mayBeSpecifiedWithDashes() {
        assertEquals("4153367222", new PhoneNumber("415-336-7222").val());
    }

    @Test
    public void mayBeSpecifiedWithAreaCodeInParenthesis() {
        assertEquals("4153367222", new PhoneNumber(" (415) 336-7222 ").val());
    }
}

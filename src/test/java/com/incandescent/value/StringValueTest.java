package com.incandescent.value;

import org.testng.annotations.Test;

public class StringValueTest {

    private static class ZipCode extends StringValue {

        public ZipCode(String value) {
            super(value);
        }
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void cannotBeEmpty() {
        new ZipCode("");
    }
}

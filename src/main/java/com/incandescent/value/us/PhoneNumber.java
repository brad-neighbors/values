package com.incandescent.value.us;

import com.incandescent.value.StringValue;

public class PhoneNumber extends StringValue {

    protected PhoneNumber(String value) {
        super(value);
        final String strippedVal = value.replace(" ", "").replace("(", "").replace(")", "").replace("-", "").trim();
        if (!strippedVal.matches("\\d{10}?")) {
            throw new IllegalArgumentException("Not a valid American phone number.");
        }
        super.value = strippedVal;
    }
}

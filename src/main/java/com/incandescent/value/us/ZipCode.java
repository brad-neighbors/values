package com.incandescent.value.us;

import com.incandescent.value.*;

import java.util.regex.Pattern;

public class ZipCode extends StringValue {

    private static final Pattern zipCodePattern = Pattern.compile("\\d{5}(-\\d{4})?");

    public ZipCode(String value) {
        super(value);
        if (!value.matches(zipCodePattern.pattern())) {
            throw new IllegalArgumentException("Not a valid American zip code.");
        }
    }
}

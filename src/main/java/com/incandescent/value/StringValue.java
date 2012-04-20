package com.incandescent.value;

import static org.apache.commons.lang.Validate.notEmpty;

public abstract class StringValue extends Value<String>{

    protected StringValue(String value) {
        super(value);
        notEmpty(value, "String value for value object cannot be empty.");
    }
}

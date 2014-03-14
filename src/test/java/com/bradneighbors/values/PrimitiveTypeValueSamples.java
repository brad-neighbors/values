package com.bradneighbors.values;

import java.util.Date;

public class PrimitiveTypeValueSamples {

  static final class TemperatureFloat extends FloatValue {

    TemperatureFloat(Float value) {
      super(value);
    }
  }

  static final class UserCountLong extends LongValue {

    UserCountLong(Long value) {
      super(value);
    }
  }

  static final class UserCountInteger extends IntegerValue {

    UserCountInteger(Integer value) {
      super(value);
    }
  }

  static final class SmallThingByte extends ByteValue {

    SmallThingByte(Byte value) {
      super(value);
    }
  }

  static final class FriendCountShort extends ShortValue {

    FriendCountShort(Short value) {
      super(value);
    }
  }

  static final class Birthday extends DateValue {
    Birthday(Date date) {
      super(date);
    }
  }
}

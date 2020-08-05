package com.mako;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest() {
        Person person = new Person(63.4f, 1.7f);
        Assertions.assertEquals(63.4f/(1.7f*1.7f), person.bmi());
    }

}

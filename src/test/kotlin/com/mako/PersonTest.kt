package com.mako.kotlin

import com.mako.Human
import com.mako.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun bmiTest() {
        val human = Human("Mako", 62.2f, 1.7f)
        Assertions.assertEquals(62.2f/(1.7f*1.7f), human.bmi())
    }

    @Test
    fun personBmiTest() {
        val person = Person(63.7f, 1.7f)
        Assertions.assertEquals(63.7f/(1.7f*1.7f), person.bmi())
    }
}
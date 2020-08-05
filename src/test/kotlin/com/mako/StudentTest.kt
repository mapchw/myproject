package com.mako.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun highestTest() {
        val student = Student("Mako", 70, 100)
        Assertions.assertEquals(100, student.highest())
    }

    @Test
    fun averageTest() {
        val student = Student("Mako", 70, 100)
        Assertions.assertEquals((70+100)/2, student.getAverage())
    }

    @Test
    fun gradingTest() {
        val student = Student("Mako", 70, 100)
        Assertions.assertEquals('B', student.grading())
    }
}
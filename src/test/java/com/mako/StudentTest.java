package com.mako;

import com.mako.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void highestScoreTest() {
        Student student = new Student("Mako", 70, 90);
        Assertions.assertEquals(90, student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("MAKO", 60, 100);
        Assertions.assertEquals((60+100)/2, student.getAverage());
    }
}

package com.example.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testPassResult() {

        String expected =
                "Student Rahul has PASSED with 90 marks.";

        String actual =
                App.calculateResult("Rahul", 90);

        assertEquals(expected, actual);
    }

    @Test
    public void testFailResult() {

        String expected =
                "Student Arun has FAILED with 20 marks.";

        String actual =
                App.calculateResult("Arun", 20);

        assertEquals(expected, actual);
    }
}

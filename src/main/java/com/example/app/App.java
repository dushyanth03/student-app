package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        String studentName = "Koushik";

        int marks = 87;

        String result =
                calculateResult(studentName, marks);

        logger.info(result);

        System.out.println(result);
    }

    public static String calculateResult(String name,
                                         int marks) {

        if (marks >= 35) {

            return "Student " + name
                    + " has PASSED with "
                    + marks + " marks.";

        } else {

            return "Student " + name
                    + " has FAILED with "
                    + marks + " marks.";
        }
    }
}

package com.mycompany.sonar;

import java.util.logging.Logger;

public class SonarTest {
    static final Logger logger = Logger.getLogger(SonarTest.class.getName());
    public static void main(String[] args) {
        SonarTest sonar = new SonarTest();
        sonar.doSomeThing();
        sonar.checkLeapYear(2011);
        logger.info("Right Way");
    }

    public void doSomeThing() {
        System.out.println("Welcome to Vector Gate.");
    }

    private void checkLeapYear(int year) {
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // year is divisible by 400, hence the year is a leap year
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

}

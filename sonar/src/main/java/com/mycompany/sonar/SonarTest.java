package com.mycompany.sonar;

public class SonarTest {

    public static void main(String[] args) {
        SonarTest sonar = new SonarTest();
        sonar.doSomeThing();
        sonar.checkLeapYear(2011);
        System.out.println("This is how we trigger");
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

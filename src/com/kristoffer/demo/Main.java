package com.kristoffer.demo;

public class Main {
    public static void main(String[] args) {

        int age = 15;

        // TODO - When does else if run?
        // TODO - Difference between if, else, if else, if else if
        if (age >= 18) {
            System.out.println("TRUE");
        } else if (age >= 16){
            System.out.println("FALSE");
        }

        // TODO - Why do we need breaks?
        switch (age) {
            case 1:
                System.out.println("You're a baby");
                break;
            case 15:
                System.out.println("You're definitely 15");
                break;
        }

        int dayOfTheWeek = 5;

        // TODO - Enhanced switches, no breaks needed and fallthrough is easier!
        switch (dayOfTheWeek) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");

            default -> System.out.println("NTA");
        }


    }
}

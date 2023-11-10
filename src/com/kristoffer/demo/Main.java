package com.kristoffer.demo;

import com.kristoffer.demo.test.AccessModTest;

public class Main {
    public static void main(String[] args) {

        // Testing Visibility
        // Instantiate
        AccessModTest accessModTest = new AccessModTest();
        Student benny = new Student();

        accessModTest.testPublic();
        /* accessModTest.testProtected();
         accessModTest.testNoModifier();
         accessModTest.testPrivate();

         */

        // Set some values
        benny.setName("Benny");
        benny.setAge(15);
        benny.setGrade('B');
        benny.setTired(true);

        // TODO - What will happen here?
        System.out.println( benny );

        // TODO - Task: +5, then subtract by 4
        benny.setScore(50);

        // TODO - WHAT HAPPENS HERE?
        System.out.println(benny.getScore());
        benny.setScore( +5 );
        System.out.println(benny.getScore());
        benny.setScore( -4 );
        System.out.println(benny.getScore());

        // TODO - Solution
        benny.setScore(50);

        System.out.println(benny.getScore());
        benny.setScore(benny.getScore() + 5 );
        System.out.println(benny.getScore());
        benny.setScore( benny.getScore() - 4 );
        System.out.println(benny.getScore());



        // TODO - Adding the book to the Student
        benny.setBook(
                new Book(250, "Benny", "Becoming a Wizard")
        );

        // TODO - What will the result be?
        System.out.println(benny.getBook());



    }
}

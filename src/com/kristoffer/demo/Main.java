package com.kristoffer.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        final String name;

        name = "Benny";


        // TODO - Difference?
        // Variables-   Mutable,
        // Final    -   Immutable
        // Enum     -   Immutable, List

        // TODO - REGEX?
        // What do we need to know?
        // 0-9
        // a-z
        // A-Z
        // []
        // ^ $ <-- good to know (optional)
        // *
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Type in your text");
            String myRegex = "[a-z]*";
            System.out.println("Regex pattern is: " + myRegex);

            boolean passwordMatcher = Pattern.matches(myRegex, sc.nextLine());

            if (passwordMatcher) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }


        }




    }
}

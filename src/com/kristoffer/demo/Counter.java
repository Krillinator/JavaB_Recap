package com.kristoffer.demo;

public class Counter {

    // Static -> points at same memory address
    // Global Scope???
    static int count;

    public void increaseCount() {
        System.out.println(count);
        count++;
        System.out.println(count);
    }

    // TODO - What would happen if i removed 'static' from 'count' variable?
    public static void increaseCountByTwo() {
        System.out.println(count);
        count += 2;
        System.out.println(count);
    }

    // TODO - What abilities does a static method gain?
    public static void sayHello() {
        System.out.println("Say HI! :)");
    }

}

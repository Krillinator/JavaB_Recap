package com.kristoffer.demo;

public class Main {
    public static void main(String[] args) {

        // Instantiate
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Counter counterC = new Counter();

        counterA.increaseCount();   // 0 -> 1
        counterB.increaseCount();   // 1 -> 2
        counterC.increaseCount();   // 2 -> 3

        // TODO - Static Method, does not require instantiation to invoke method
        Counter.sayHello();

        // TODO - Counter DOES NOT have Static Currently
        // What's going to happen when we run the code now?

        // TODO - Why does each counter start with 0?
        // Memory positions, they are NOT shared

    }
}

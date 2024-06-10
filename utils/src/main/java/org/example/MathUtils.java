package org.example;

public class MathUtils {
    MathLibrary mathLibrary;

    public MathUtils() {
        mathLibrary = new MathLibrary();
    }

    public int addTwoNumbers(int a, int b) {
        return mathLibrary.add(a, b);
    }
}
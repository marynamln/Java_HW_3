package org.example;

public class MainApp {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.addTwoNumbers(15, 13);
        System.out.println("Result: " + result);
    }
}
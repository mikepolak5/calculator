package com.calculator;

public class Calculator {
    public int Substract(int a, int b) {
        return a - b;
    }

    public int Add(int a, int b) {
        return a + b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int result = calculator.Add(1, 2);
        System.out.println("Result: " + result);
    }
}

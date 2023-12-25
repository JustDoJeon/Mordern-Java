package com.dodo.mordernjava.java8.OopExample;

public class CalculatorService {

    private Calculation calculation;

    private Calculation calculation2;

    public CalculatorService() {}

    public CalculatorService(Calculation calculation, Calculation calculation2) {
        this.calculation = calculation;
        this.calculation2 = calculation2;
    }

    public CalculatorService(final Calculation calculation) {
        this.calculation = calculation;
    }



    public int calculate(int num1, int num2) {
        if (num1 > 10 && num2 < num1) {
            return calculation2.calculate(num1, num2);
        } else {
            throw new IllegalArgumentException("Invalid Input num1 : " + num1 + " num2 : " + num2);
        }
    }
}

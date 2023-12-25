package com.dodo.mordernjava.java8.OopExample;

public class FpCalculatorService  {

        public int calculate(Calculation calculation, int num1, int num2) {
            if (num1 > 10 && num2 < num1) {
                return calculation.calculate(num1, num2);
            } else {
                throw new IllegalArgumentException("Invalid Input num1 : " + num1 + " num2 : " + num2);
            }
    }
}


package com.dodo.mordernjava.java8.OopExample;

public class OopExamples {

    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService(new Addition(), new Subtraction());

        final int additionResult = calculatorService.calculate(1, 1);
        System.out.println(additionResult);

        final int subtractResult = calculatorService.calculate(1, 1);
        System.out.println(subtractResult);

        final int multiplicationResult = calculatorService.calculate(1, 1);
        System.out.println(multiplicationResult);

        final int divisionResult = calculatorService.calculate(1, 1);
        System.out.println(divisionResult);

        final FpCalculatorService fpCalculatorService = new FpCalculatorService();
        System.out.println("    addition : " + fpCalculatorService.calculate(new Addition(),11,4));
        System.out.println("    substract : " + fpCalculatorService.calculate(new Subtraction(),11,1));
        System.out.println("    multiplication : " + fpCalculatorService.calculate(new Multiple(),11,2));
        System.out.println("    division : " + fpCalculatorService.calculate(new Division(),20,4));




    }


    interface Calculation {
        int calculate(int num1, int num2);
    }

    class Addition implements Calculation {

        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    }

    class Subtraction implements Calculation {

        @Override
        public int calculate(int num1, int num2) {
            return num1 - num2;
        }
    }

    class Division implements Calculation {

        @Override
        public int calculate(int num1, int num2) {
            return num1 / num2;
        }
    }

    class Multiple implements Calculation {
        @Override
        public int calculate(int num1, int num2) {
            return num1 * num2;
        }
    }


    class CalculatorService {

        private final Calculation calculation;

        private final Calculation calculation2;


        public CalculatorService(Calculation calculation, Calculation calculation2) {
            this.calculation = calculation;
            this.calculation2 = calculation2;
        }

        public CalculatorService(final Calculation calculation) {
            this.calculation = calculation;
        }

        public int calculate(int num1, int num2) {
            if (num1 > 10 && num2 < num1) {
                return calculation.calculate(num1, num2);
            } else {
                throw new IllegalArgumentException("Invalid Input num1 : " + num1 + " num2 : " + num2);
            }
            return calculation.calculate(num1, num2);
        }

        public int compute(int num1, int num2) {
            if (num1 > 10 && num2 < num1) {
                return calculation2.calculate(num1, num2);
            } else {
                throw new IllegalArgumentException("Invalid Input num1 : " + num1 + " num2 : " + num2);
            }
            return calculation.calculate(num1, num2);
        }
    }

    class FpCalculatorService {
        public int calculate(Calculation calculation, int num1, int num2) {
            if (num1 > 10 && num2 < num1) {
                return calculation2.calculate(num1, num2);
            } else {
                throw new IllegalArgumentException("Invalid Input num1 : " + num1 + " num2 : " + num2);
            }
            return calculation.calculate(num1, num2);
        }


    }
}

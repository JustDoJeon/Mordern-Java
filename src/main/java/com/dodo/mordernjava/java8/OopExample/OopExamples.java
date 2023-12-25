package com.dodo.mordernjava.java8.OopExample;

public class OopExamples {

    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService();

        final int additionResult = calculatorService.calculate(1, 1);
        System.out.println(additionResult);

        final int subtractResult = calculatorService.calculate(1, 1);
        System.out.println(subtractResult);

        final int multiplicationResult = calculatorService.calculate(1, 1);
        System.out.println(multiplicationResult);

        final int divisionResult = calculatorService.calculate(1, 1);
        System.out.println(divisionResult);

        final FpCalculatorService fpCalculatorService = new FpCalculatorService();
//        System.out.println("      addition : " + fpCalculatorService.calculate(new Addition(),11,4));
//        System.out.println("     substract : " + fpCalculatorService.calculate(new Subtraction(),11,1));
//        System.out.println("multiplication : " + fpCalculatorService.calculate(new Multiple(),11,2));
//        System.out.println("      division : " + fpCalculatorService.calculate(new Division(),20,4));


        System.out.println("      addition : " + fpCalculatorService.calculate((i1,i2 ) -> i1+i2 ,11,4));
        System.out.println("      addition : " + fpCalculatorService.calculate((i1,i2 ) -> i1-i2 ,11,1));
        System.out.println("      addition : " + fpCalculatorService.calculate((i1,i2 ) -> i1*i2 ,11,2));
        System.out.println("      addition : " + fpCalculatorService.calculate((i1,i2 ) -> i1/i2 ,20,4));



    }
}

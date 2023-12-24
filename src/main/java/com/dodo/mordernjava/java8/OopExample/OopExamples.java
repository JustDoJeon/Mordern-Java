package com.dodo.mordernjava.java8.OopExample;

public class OopExamples {

    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService(new Addition());

        final int additionResult = calculatorService.calculate(1, 1);
        System.out.println(additionResult);

        final int subtractResult = calculatorService.calculate( 1, 1);
        System.out.println(subtractResult);
    }

}

interface Calculation {
    int calculate(int num1, int num2);
}

class Addition implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}

class Subtraction implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1-num2;
    }
}

class Division implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1/num2;
    }
}
class Multiple implements Calculation {

    @Override
    public int calculate(int num1, int num2) {
        return num1*num2;
    }
}


class CalculatorService {

    private final Calculation calculation;

    public CalculatorService(final Calculation calculation) {
        this.calculation = calculation;
    }

    public int calculate( int num1, int num2) {

//        if(calculation == '+'){
//            return num1 + num2;
//        }else if (calculation == '-'){
//            return num1-num2;
//        }else if (calculation=='/'){
//            return num1/num2;
//        }else if(calculation=='*'){
//            return num1*num2;
//        }else{
//            throw new IllegalArgumentException("Unknown calculation: " + calculation);
//        }

        return calculation.calculate(num1, num2);
    }
}




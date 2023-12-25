package com.dodo.mordernjava.java8.OopExample;

public class Addition implements Calculation{

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}

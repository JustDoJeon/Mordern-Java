package com.dodo.mordernjava.java8.FunctionalInterfaceExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

//        Function<String, Integer> toInt = new Function<String,Integer>() {
//
//
//            @Override
//            public Integer apply(final String value) {
//                return Integer.parseInt(value);
//            }
//        };
//
//        final Integer number = toInt.apply("100");
//        System.out.println(number);


        final Function<String, Integer> toInt =  value -> Integer.parseInt(value);


        final Integer number = toInt.apply("100");
        System.out.println(number);

//        final Function<Integer,Integer> identity = Function.identity();

        final Function<Integer,Integer> identity = t ->t;

        System.out.println(identity.apply(999));
    }
}

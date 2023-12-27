package com.dodo.mordernjava.java8.FunctionalInterfaceExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
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


        final Function<String, Integer> toInt = value -> Integer.parseInt(value);


        final Integer number = toInt.apply("100");
        System.out.println(number);

//        final Function<Integer,Integer> identity = Function.identity();

        final Function<Integer, Integer> identity = t -> t;

        System.out.println(identity.apply(999));

//        Consumer<String> print = new Consumer<String>() {
//            @Override
//            public void accept(String value) {
//                System.out.println(value);
//            }
//        };
//
//        print.accept("Hello");
        final Consumer<String> print = value -> System.out.println(value);
//        final Function<String,Void> print2 = value -> System.out.println(value); Function은 입력 출력 값이 있어야해서 에러가 난다.
        final Consumer<String> greetings = value -> System.out.println("Hello" + value);
        print.accept("Hello");
        greetings.accept("World");
        greetings.accept("dodo");

        //어떤 조건이 만족하는지 확인하는 자바 8 메소드 Predicate
        Predicate<Integer> isPositive = i -> i > 0;
        Predicate<Integer> lessThan3 = i -> i < 3;

        System.out.println(isPositive.test(1)); //초기 에러 : Functional Interface 에 해당하는 구현한 메소드를 호출해줘야함
        System.out.println(isPositive.test(0));
        System.out.println(isPositive.test(-1));

        List<Integer> numbers = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);

        List<Integer> positiveNumbers = new ArrayList<>();

        List<Integer> numbersLessThan3 = new ArrayList<>();


        for (Integer num : numbers) {
            if (isPositive.test(num)) {
                positiveNumbers.add(num);
            }
        }

        for (Integer num : numbers) {
            if (lessThan3.test(num)) {
                numbersLessThan3.add(num);
            }
        }

//        System.out.println(positiveNumbers);

        System.out.println(positiveNumbers);
        System.out.println(numbersLessThan3);
        System.out.println("positive integers : " + filter(numbers, isPositive));
        System.out.println("less than 3 numbers : " + filter(numbers, lessThan3));


        final Supplier<String> helloSupplier = () -> "Hello";

        System.out.println(helloSupplier.get()  + "world");

        long start = System.currentTimeMillis();
        printIfValidIndex(0,getVeryExpensiveValue() );
        printIfValidIndex(1,getVeryExpensiveValue());
        printIfValidIndex(-1,getVeryExpensiveValue() );

        System.out.println( ("걸린시간 (초) : " +( System.currentTimeMillis() - start) /1000 + "초"  )) ;

    }

    private static String getVeryExpensiveValue() {
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }
        return "dodo";
    }

    private static void printIfValidIndex(int number, String value) {
        if(number >= 0 ) {
            System.out.println("The Value is   : " + value);
        }else{
            System.out.println("Invalid");
        }
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T input : list) {
            if (filter.test(input)) {
                result.add(input);
            }
        }
        return result;
    }
}


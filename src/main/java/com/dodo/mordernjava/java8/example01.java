package com.dodo.mordernjava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 목적
 * 출력 1 : 2 : 3 : 4 : 5 : 6 : 7 : 8 : 9 : 10
 */
public class example01 {

    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        final StringBuilder stringBuilder = new StringBuilder();

//        method1(numbers, stringBuilder);

//        method2(numbers, stringBuilder);

        //java8 functional programming 으로 표현
        final String result = numbers.stream()
                .map(String::valueOf) // String.valueOf() 를 호출하고 매개변수로 numbers의 값들을 넣는것이다. => Integer -> String
                .collect(Collectors.joining(" : ")); //각각 조인을 해라.  " : " 로
        System.out.println(result);




    }

    private static void method1(List<Integer> numbers, StringBuilder stringBuilder) {
        final int size = numbers.size();
        for(int i=0; i<size; i++) {
            stringBuilder.append(numbers.get(i));
            if(i != size -1 ){
                stringBuilder.append(" : ");
            }
        }
        System.out.println(stringBuilder);
    }

    private static void method2(List<Integer> numbers, StringBuilder stringBuilder) {
        for(Integer number : numbers) {
            stringBuilder.append(number).append(" : ");
        }
        if(stringBuilder.length()>0){
            stringBuilder.delete(stringBuilder.length()-3, stringBuilder.length());
        }

        System.out.println(stringBuilder);
    }


}

package com.dodo.mordernjava.java8.streamEx01;

import java.util.List;

public class StrampPrelude {

    public static void main(String[] args) {
        final int abs1 = Math.abs(-1);
        final int abs2 = Math.abs(1);

        System.out.println("abs1 = " + abs1);
        System.out.println("abs2 = " + abs2);
        System.out.println("abs1 == abs2 is " + ( abs1 == abs2));

        final int minInt = Math.abs(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("minInt : " + minInt); // minInt : -2147483648 자바에는  2147483647 까지만있어서 2147483648을 출력할 수가없음

    }

    //Idemtoty Function 만들기

}

package com.dodo.mordernjava.java8.FunctionalInterfaceExample;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer,Integer> multiply2 = (i) -> i*2;
        System.out.println(plus10.apply(1));

        System.out.println(multiply2.apply(2));

        //조합하는방법 Higher Order function 의 성격 +10의 compose x2 => x2를 먼저 하는 개념
        Function<Integer, Integer> muiltiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(muiltiply2AndPlus10.apply(2));

        // andThen 방식은
        System.out.println(plus10.andThen(multiply2).apply(2)); //24  10 +2 하고 * 2


        /**
         * Consumer 공부
         * 타입을 받아서
         */
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        /**
         * Supplier
         * 받아올값 정해져놓고 씀
         */
        Supplier<Integer> get10 = () -> 10;
        get10.get();
        /**
         * Predicate 인자하나를 받아서 true false를 리턴해주는 함수
         */
        Predicate<String> startsWithDodo = (s) -> s.startsWith("Dodo");
        System.out.println(startsWithDodo.test("dodo2")); //false
        System.out.println(startsWithDodo.test("Dodo2")); //true


        BinaryOperator<Integer> sum = (a,b) -> a+b;
        System.out.println(sum.apply(10,15));


    }

    private void run() {
        int baseNumber  = 10;

        //로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        //익명클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        //람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);

        /**
         *     Scope
         *     Local class 와 Anomynous 는 shadowing (가려진다)
         *     하지만!! Lambda는 shadowing 이 이뤄지지않음
         *     익명클래스는 새로운  scope을 만들지만 람다는 람다'를' 감싸고있는 스콥과 같아
         */

    }


}

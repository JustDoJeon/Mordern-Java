package com.dodo.mordernjava.java8.OopExample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void calculate() throws Exception{
        CalculatorService calculatorService = new CalculatorService(new Multiple());

        final int actual = calculatorService.calculate(1,1);

        Assertions.assertThat(actual).isEqualTo(0);

    }
}
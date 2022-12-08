package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        //GIVEN
        BigDecimal bd1 =new BigDecimal(0.3);
        BigDecimal bd2 =new BigDecimal(0.1);
        BigDecimal expectedSum = bd1.add(bd2);

        BigDecimal actualSum =  Calculator.add(bd1,bd2);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void substractTest() {
        BigDecimal bd1 =new BigDecimal(0.3);
        BigDecimal bd2 =new BigDecimal(0.1);
        BigDecimal expectedSum = bd1.subtract(bd2);

        BigDecimal actualSum =  Calculator.substract(bd1,bd2);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void divideTest() {
        BigDecimal bd1 =new BigDecimal(0);
        BigDecimal bd2 =new BigDecimal(1);
        BigDecimal expectedSum = bd1.divide(bd2);

        BigDecimal actualSum =  Calculator.divide(bd1,bd2);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    void multiplyTest() {
        BigDecimal bd1 =new BigDecimal(0);
        BigDecimal bd2 =new BigDecimal(1);
        BigDecimal expectedSum = bd1.multiply(bd2);

        BigDecimal actualSum =  Calculator.multiply(bd1,bd2);

        assertEquals(expectedSum, actualSum);
    }
}
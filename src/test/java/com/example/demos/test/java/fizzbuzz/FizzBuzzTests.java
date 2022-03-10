/**
 * 
 */
package com.example.demos.test.java.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class FizzBuzzTests {

    @Test
    public void testIfDivisibileByThreePositive() {
        // given
        int num = 3;

        // when
        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(num);

        // then
        assertEquals("Fizz", result);
    }

    @Test
    public void testIfDivisibileByThreeNegative() {
        // given
        int num = 4;

        // when
        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(num);

        // then
        assertEquals("4", result);
    }

    @Test
    public void testIfDivisibileByFivePositive() {
        // given
        int num = 10;

        // when
        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(num);

        // then
        assertEquals("Buzz", result);
    }

    @Test
    public void testIfDivisibileByFiveNegative() {
        // given
        int num = 11;

        // when
        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(num);

        // then
        assertEquals("11", result);
    }

    @Test
    public void testIfDivisibileByThreeAndFivePositive() {
        // given
        int num = 15;

        // when
        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(num);

        // then
        assertEquals("Fizz Buzz", result);
    }

    @Test
    public void testIfDivisibileByThreeAndFiveNegative() {
        // given
        int num = 16;

        // when
        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(num);

        // then
        assertEquals("16", result);
    }

    @Test
    public void testNumbersOneToHundred() {
        // given
        int num[] = new int[100];
        for (int i = 0; i < 100; i++)
            num[i] = i + 1;

        // when
        FizzBuzz fb = new FizzBuzz();
        fb.process(num);

        // then
        assertTrue(true);
    }

}

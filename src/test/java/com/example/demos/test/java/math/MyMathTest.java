/**
 * 
 */
package com.example.demos.test.java.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class MyMathTest {

    @Test
    public void givenTwoIntegers_whenAddingThem_thenResultsIsTheSum() {
        // given
        int x = 5;
        int y = 6;

        // when
        MyMath myMath = new MyMath();
        int result = myMath.add(x, y);

        // then
        assertEquals(result, 11);
    }

    @Test
    public void givenTwoIntegers_whenSubtracting_thenResultIsMinus() {
        // given
        int x = 10;
        int y = 5;

        // when
        MyMath myMath = new MyMath();
        int result = myMath.subtract(x, y);

        // then
        assertEquals(result, 5);
    }

}

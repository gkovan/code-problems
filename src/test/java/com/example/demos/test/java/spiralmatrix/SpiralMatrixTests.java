/**
 * 
 */
package com.example.demos.test.java.spiralmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Create a function that takes an integer N and returns a NxN spiral matrix. matrix(4) [[1, 2, 3,
 * 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
 */
public class SpiralMatrixTests {

    @Test
    public void testMatrixWhereNIsOne() {
        // given
        int n = 1;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        // then
        assertEquals(1, result[0][0]);
    }

    @Test
    public void testMatrixDimensions() {
        // given
        int n = 2;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        assertEquals(2, result.length);
        assertEquals(2, result[0].length);
    }

    @Test
    public void testMatrixDimensionsBiggerSize() {
        // given
        int n = 10;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        // then
        assertEquals(10, result.length);
        assertEquals(10, result[0].length);
    }

    @Test
    public void testCreationOfFirstRow() {

        // given
        int n = 2;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        // then
        assertEquals(1, result[0][0]);
        assertEquals(2, result[0][1]);
    }

    @Test
    public void testCreationOfLastColumn() {

        // given
        int n = 2;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        // then
        assertEquals(2, result[0][1]);
        assertEquals(3, result[1][1]);
    }

    @Test
    public void testCreationOfLastRow() {

        // given
        int n = 2;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        // then
        assertEquals(4, result[1][0]);
        assertEquals(3, result[1][1]);
    }

    @Test
    public void testTwoByTwoMatrix() {

        // given
        int n = 2;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.create(n);

        // then
        assertEquals(1, result[0][0]);
        assertEquals(2, result[0][1]);

        assertEquals(2, result[0][1]);
        assertEquals(3, result[1][1]);

        assertEquals(4, result[1][0]);
        assertEquals(3, result[1][1]);
    }

    @Test
    public void testFourByFourMatrix() {

        // given
        int n = 4;

        // when we call the function
        SpiralMatrix sm = new SpiralMatrix();
        int result[][] = sm.spiral(n);

        // then
        int[] row1 = { 1, 2, 3, 4 };
        assertArrayEquals(row1, result[0]);

        int[] row2 = { 12, 13, 14, 5 };
        assertArrayEquals(row2, result[1]);

        int[] row3 = { 11, 16, 15, 6 };
        assertArrayEquals(row3, result[2]);

        int[] row4 = { 10, 9, 8, 7 };
        assertArrayEquals(row4, result[3]);
    }

}

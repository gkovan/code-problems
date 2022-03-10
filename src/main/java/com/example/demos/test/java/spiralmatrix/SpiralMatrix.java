/**
 * 
 */
package com.example.demos.test.java.spiralmatrix;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class SpiralMatrix {

    public int[][] spiral(int n) {

        int[][] spiral = new int[n][n];

        int value = 1;

        int minCol = 0;

        int maxCol = n - 1;

        int minRow = 0;

        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;

                value++;
            }

            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;

                value++;
            }

            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;

                value++;
            }

            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }

            System.out.println();
        }
        return spiral;
    }

    public int[][] create(int n) {
        int[][] matrix = new int[n][n];

        int cnt = 1;
        int row = 0;
        int col = 0;

        // top row
        row = 0;
        for (int i = 0; i < n; i++) {
            matrix[row][i] = cnt++;
        }

        // end col
        col = n - 1;
        for (int j = 0 + 1; j < n; j++) {
            matrix[col][j] = cnt++;
        }

        // bot row
        row = n - 1;
        for (int k = n - 2; k >= 0; k--) {
            matrix[row][k] = cnt++;
        }

        // beg col
        col = 0;
        for (int l = n - 2; l > 0; l--) {
            matrix[l][col] = cnt++;
        }
        return matrix;
    }

}

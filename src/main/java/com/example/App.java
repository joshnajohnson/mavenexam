package com.example;

public class App {
    /**
     * Multiplies two matrices A and B.
     * @param A First matrix
     * @param B Second matrix
     * @return Resultant matrix
     */
    public static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Check if multiplication is possible
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        
        try {
            int[][] result = multiply(A, B);
            System.out.println("Resultant Matrix:");
            for (int[] row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}



package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMultiply() {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] expected = {{19, 22}, {43, 50}};
        
        int[][] actual = App.multiply(A, B);
        
        // In JUnit 5, the failure message is the last argument
        assertArrayEquals(expected, actual, "The matrix multiplication result is incorrect");
    }

    @Test
    public void testIncompatibleMatrices() {
        int[][] A = {{1, 2, 3}}; // 1x3
        int[][] B = {{1, 2}, {3, 4}}; // 2x2
        
        // Use assertThrows to check for exceptions in JUnit 5
        assertThrows(IllegalArgumentException.class, () -> {
            App.multiply(A, B);
        });
    }
}

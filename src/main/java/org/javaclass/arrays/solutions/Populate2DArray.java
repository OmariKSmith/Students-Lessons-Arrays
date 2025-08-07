package org.javaclass.arrays.solutions;
//! 1. Create a method named populate2dCharArray that accept a char 2D array as an argument
//!    and populates the 2D array argument with characters

public class Populate2DArray {

    public void populate2dCharArray(char[][] char2D) {
        for (int i = 0; i < char2D.length; i++) {
            for (int j = 0; j < char2D[i].length; j++) {
                char2D[i][j] = (char) (j+65);
            }
        }
    }

}

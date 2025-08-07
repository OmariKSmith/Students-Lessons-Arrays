package org.javaclass.arrays.solutions;

//! 1. Declare a char 2d array explicit initialized with the characters {h,e,l,l,o},{w,o,r,l,d,s}.

//! 2. Declare an int literal initialized 2d array with a size of the first 2d array.

//! 3. Declare a String 2d array explicit initialized with {"zero","one", "two"},{"three","four","five"}

//! 4. Declare a String literal initialized 2d array with a size of the first 2d String array.

//! 5. Initialize getters for this class.

public class Declare2DArray {
    char[][] chars2D = {{'h','e','l','l','o'},{'w','o','r','l','d','s'}};
    int[][] ints2D = new int[chars2D.length][chars2D[0].length];
    String[][] strings2D = {{"zero","one", "two"},{"three","four","five"}};
    String[][] strings2D2 = new String[strings2D.length][strings2D.length];


    public char[][] getChars2D() {
        return chars2D;
    }

    public void setChars2D(char[][] chars2D) {
        this.chars2D = chars2D;
    }

    public int[][] getInts2D() {
        return ints2D;
    }

    public void setInts2D(int[][] ints2D) {
        this.ints2D = ints2D;
    }

    public String[][] getStrings2D() {
        return strings2D;
    }

    public void setStrings2D(String[][] strings2D) {
        this.strings2D = strings2D;
    }

    public String[][] getStrings2D2() {
        return strings2D2;
    }

    public void setStrings2D2(String[][] strings2D2) {
        this.strings2D2 = strings2D2;
    }
}

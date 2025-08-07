package org.javaclass.arrays.solutions;
//! 1. Declare an char array explicit initialized with the characters h,e,l,l,o.

//! 2. Declare an int literal initialized array with a size of the first array.

//! 3. Declare a String array explicit initialized with "zero","one", "two".

//! 4. Declare an String literal initialized array with a size of the first String array.

//! 5. Initialize getters for this class.

public class DeclareArrays {
    char[] charArray = {'h','e','l','l','o'};
    int[] intArray = new int[charArray.length];
    String[] strArray1 = {"zero","one", "two"};
    String[] strArray2 = new String[strArray1.length];

    public char[] getCharArray() {
        return charArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public String[] getStrArray1() {
        return strArray1;
    }

    public String[] getStrArray2() {
        return strArray2;
    }
}

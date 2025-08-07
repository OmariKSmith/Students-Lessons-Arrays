package org.javaclass.arrays.solutions;
//! Create 3 static methods
//! One that returns a copy of a string array argument
//! One that returns a copy of a int array argument
//! One that returns a copy of a char array argument
public class CopyArrays {

    public static String[] copyStringArray(String[] source) {
        String[] arr = new String[source.length];
        for (int i = 0; i < source.length; i++) {
            arr[i] = source[i];
        }
        return arr;
    }

    public static int[] copyIntArray(int[] source) {
        int[] arr = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            arr[i] = source[i];
        }
        return arr;
    }

    public static char[] copyIntArray(char[] source) {
        char[] arr = new char[source.length];
        for (int i = 0; i < source.length; i++) {
            arr[i] = source[i];
        }
        return arr;
    }
}

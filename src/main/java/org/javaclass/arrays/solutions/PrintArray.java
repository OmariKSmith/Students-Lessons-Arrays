package org.javaclass.arrays.solutions;
//! 1. Create a method named printIntArray that accepts an int array as
//! an argument and outputs array elements to console

//! 2. Create a method named printCharArray that accepts a char array as
//! an argument and outputs array elements to console

//! 3. Create a method named printStringArray that accepts a String array as
//! an argument and outputs array elements to console
public class PrintArray {


    public void printIntArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printCharArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printStringArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

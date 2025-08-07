package org.javaclass.arrays.solutions;

//! Create a method named sumIntArray that accepts an int array as
//! an argument and returns the sum of the array elements.
public class SumArray {

    int sumIntArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}

package org.javaclass.arrays.solutions;
import java.util.Arrays;

//! 1. Using the DeclaredArray class, populate the intArray variable
//!    with the elements from the charArray variable.


//! 2. Using the DeclaredArray class, populate the strArray2 variable
//!    with the elements from the strArray1 variable.

//!3. Use the main to build and run the program
public class PopulateArrays2 {
    public static void main(String[] args) {
        DeclareArrays arrays = new DeclareArrays();
        int[] ints = arrays.getIntArray();
        char[] chars = arrays.getCharArray();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = chars[i];
        }

        System.out.println(Arrays.toString(ints));

        String[] strArr1 = arrays.getStrArray1();
        String[] strArr2 = arrays.getStrArray2();

        for (int i = 0; i < strArr2.length; i++) {
            strArr2[i] = strArr1[i];
        }

        System.out.println(Arrays.toString(strArr2));
    }
}

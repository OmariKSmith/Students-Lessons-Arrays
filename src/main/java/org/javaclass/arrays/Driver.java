package org.javaclass.arrays;

import org.javaclass.arrays.solutions.CopyArrays;
import org.javaclass.arrays.solutions.DeclareArrays;
import org.javaclass.arrays.solutions.PopulateArrays1;
import org.javaclass.arrays.solutions.PrintArray;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        PrintArray printArray = new PrintArray();
        DeclareArrays arrays = new DeclareArrays();
        PopulateArrays1 a2 = new PopulateArrays1();
        printArray.printCharArray(arrays.getCharArray());
        printArray.printStringArray(arrays.getStrArray2());

        int[] intArr = CopyArrays.copyIntArray(a2.getInts());
        printArray.printIntArray(intArr);

    }
}

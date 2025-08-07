package org.javaclass.arrays.solutions;

//! 1. Declare a char array, an int array, and a String array,
//!    literal initialized with the size of 5 for each array.

//! 2. Populate each array with elements of the proper type.
//!
//! 3. Use a default constructor to populate
public class PopulateArrays1 {

    char[] chars = new char[5];
    int[] ints = new int[5];
    String[] strings = new String[5];

   public PopulateArrays1(){
       chars[0] = 'a';
       chars[1] = 'b';
       chars[2] = 'c';
       chars[3] = 'd';
       chars[4] = 'd';

       ints[0] = 0;
       ints[1] = 1;
       ints[2] = 2;
       ints[3] = 7;
       ints[4] = 99;

       strings[0] = "sa";
       strings[1] = "sb";
       strings[2] = "sc";
       strings[3] = "sd";
       strings[4] = "se";

   }

    public char[] getChars() {
        return chars;
    }

    public int[] getInts() {
        return ints;
    }

    public String[] getStrings() {
        return strings;
    }
}

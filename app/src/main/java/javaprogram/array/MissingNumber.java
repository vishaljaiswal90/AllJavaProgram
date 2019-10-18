package javaprogram.array;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {
    public static void main(String [] args){
        printMissingNumber(new int [] {1,2,3,4,5,8,9,10},11);
    }

    private static void printMissingNumber(int [] numbers,int count){
        int missingCount = count - numbers.length;

        // BitSet is a class defined in the java.util package.
        // It creates an array of bits represented by boolean values. BitSet() :
        // A no-argument constructor to create an empty BitSet object.

        BitSet bitSet = new BitSet(count);

        for (int number : numbers){
            bitSet.set(number -1);

        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }


    }
}

package javaprogram.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneMissingNumber {
    public static void main(String [] args){
        int [] iArray =  new int [] {1,2,4,5};
        int missingNumber = getMissimgNumber(iArray,5);

        System.out.printf("Missing numbers in integer array %s ,with total number %d is %n",
                Arrays.toString(iArray),missingNumber);
    }

    private static int getMissimgNumber(int [] numbers,int totalCount){
        int expectedTotal =  (totalCount *(totalCount +1))/2;
        int actualNumebr = 0;
        for (int i : numbers){
            actualNumebr += i;
        }

        return expectedTotal - actualNumebr;
    }
}

package javaprogram.array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String [] args){
        secondLarge(new int[]{10,20,60,27,90,83});
    }

    private static void secondLarge(int[] ints) {

        int firstLargest, secondLargest;
        //Checking first two elements of input array
        if (ints[0]>ints[1]){
            //If first element is greater than second element
            firstLargest = ints[0];
            secondLargest = ints[1];
        }else {

            //If second element is greater than first element

            firstLargest = ints[1];
            secondLargest = ints[0];
        }
        //Checking remaining elements of input array

        for (int i = 2; i < ints.length; i++) {
            if(ints[i] > firstLargest)
            {
                //If element at 'i' is greater than 'firstLargest'

                secondLargest = firstLargest;

                firstLargest = ints[i];
            }
            else if (ints[i] < firstLargest && ints[i] > secondLargest)
            {
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'

                secondLargest = ints[i];
            }
        }
        System.out.println("Input Array :");

        System.out.println(Arrays.toString(ints));

        System.out.println("Second Largest Element : ");

        System.out.println(secondLargest);
    }
}

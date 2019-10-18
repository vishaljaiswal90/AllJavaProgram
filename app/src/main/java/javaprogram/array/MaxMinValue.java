package javaprogram.array;

public class MaxMinValue {

    public static void main(String [] args){
        int[]  array =  new int[]{10,20,100,60,80,5};
        int smallNumber =  array[0];
        int largNumber =  array[0];

        for (int i=0;i<array.length;i++){
            if (smallNumber >array[i]){
                smallNumber = array[i];
            }else if (largNumber <array[i]){
                largNumber =  array[i];
            }
        }
        System.out.print(smallNumber +"  " +largNumber);
    }
}

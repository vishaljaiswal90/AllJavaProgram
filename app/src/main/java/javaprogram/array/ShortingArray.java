package javaprogram.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javaprogram.collectionProgram.MyComprator;

public class ShortingArray {
    public static void main(String [] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 2, 7, 0};

        List list = Arrays.asList(arr);
        Collections.sort(list,new MyComprator());

        Iterator<Integer> iterable = list.iterator();
        while (iterable.hasNext()){
            Integer integer = (Integer) iterable.next();
            System.out.print(integer);
        }

    }
}

package javaprogram.collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComprableDemo {

    public static void main(String [] args){
        int arrs [] = {1,20,4,5};
        List arr = Arrays.asList(arrs);
//        ArrayList arr = new ArrayList();
        arr.add(20);
        arr.add(10);
        arr.add(1);
        arr.add(2);
        arr.add(0);
        arr.add(22);
        Collections.sort(arr);
//        Collections.sort(list);
        System.out.println(arr);
//        System.out.println(list);
    }
}

package javaprogram.collectionProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortingTest {
    public static void main(String [] agrs){
        TreeSet arrayList =  new TreeSet(new MyComprator());
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(122);
        arrayList.add(120);


        System.out.println(arrayList);


    }

}


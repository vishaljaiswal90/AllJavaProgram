package javaprogram.collectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String [] args){
        ArrayList<String> pojoClass = new ArrayList<>();

        pojoClass.add("vishal");
        pojoClass.add("vishal");
        pojoClass.add("vishl");
        pojoClass.add("vihal");
        pojoClass.add("vshal");
        pojoClass.add("vishl");
        pojoClass.add("vish");
        pojoClass.add("vishal");


        Iterator iterator = pojoClass.iterator();

        while (iterator.hasNext()){

           String ss = (String) iterator.next();


                System.out.println(ss);


        }
    }
}

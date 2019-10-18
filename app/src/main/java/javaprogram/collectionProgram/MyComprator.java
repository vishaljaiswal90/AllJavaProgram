package javaprogram.collectionProgram;

import java.util.Comparator;

public class MyComprator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        Integer integer1 =(Integer)o;
        Integer integer2 =(Integer)t1;
        return  integer1.compareTo(integer2);
    }
}

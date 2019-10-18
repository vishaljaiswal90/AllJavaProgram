package javaprogram.collectionProgram;

import java.util.HashSet;

public class HasSetDemo {
    public static void main(String [] args){
        HashSet<String> strings = new HashSet<>();
        strings.add("s");
        strings.add("v");
        strings.add("s");
        strings.add(null);
        strings.add(null);
        strings.add("v");
        strings.add("p");
        System.out.println(strings);
    }
}

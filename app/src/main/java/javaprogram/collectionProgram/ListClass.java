package javaprogram.collectionProgram;

import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String [] arg){
        List l = new ArrayList();
        ArrayList al = new ArrayList(l);
        System.out.print(l.size());
        l.add("vishal");
        l.add(0,"vikas");
        l.add(2,"sapna");
        l.add(3,"sapna");
        l.remove(1);
        al.add(0,"vj");
        al.add(1,"sj");
        l.addAll(1,al);
        l.retainAll(al);
        
//        l.clear();
//        l.addAll(l);

        System.out.println(l);
        System.out.println(l.get(1));

    }
}

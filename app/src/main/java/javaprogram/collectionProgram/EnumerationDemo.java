package javaprogram.collectionProgram;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String [] args){
        Vector<String> vectorList = new Vector<>();
        vectorList.addElement("vishal");
        vectorList.addElement("vishal");
        vectorList.addElement("vishal");
        vectorList.addElement("vishal");
        vectorList.addElement("sapna");
        vectorList.addElement("vishal");
        vectorList.addElement("vishal");
        vectorList.addElement(null);
        System.out.println(vectorList);
        Enumeration enumeration  =  vectorList.elements();
        while (enumeration.hasMoreElements()){
            String s = (String) enumeration.nextElement();
            if (s == "vishal" ){
                System.out.println(s);
            }
        }
    }
}

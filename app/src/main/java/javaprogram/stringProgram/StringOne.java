package javaprogram.stringProgram;

public class StringOne {

    public static void main(String [] args){
        String s =  new String("vishal");
        String s1 =  new String("vishal");

        StringBuffer stringBuffer = new StringBuffer("sapna");
        StringBuffer stringBuffe1 = new StringBuffer("sapna");

        if (s == s1){
            System.out.print(" s true");
        }else {
            System.out.print(" s false");
        }
        if (stringBuffer == stringBuffe1){
            System.out.print(" sb true");
        }else {
            System.out.print(" sb false");
        }
    }
}

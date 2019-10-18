package javaprogram.array;

public class Test {
    public static void main(String [] args){
        String ss = "vishal";
//        String ss1 = "vishal";
        String ss1 = new String("vishal");
        if (ss.equals(ss1)){
            System.out.println("etrue");
        }else {
            System.out.println("efalse");
        }
        if (ss== ss1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

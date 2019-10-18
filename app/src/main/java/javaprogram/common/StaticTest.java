package javaprogram.common;

public class StaticTest {

    static String ss = "vishal";

    // nested class ->  static class
    public static class nestedClass {

        private void printMsg (){
            System.out.print("nested class  " + ss);
        }
    }

    public class InnerClass{

        private void printMess(){
            System.out.print("inner class  " + ss);
        }
    }

    public static void main (String [] args){


        // In order to create instance of Inner class we need an Outer class
        // instance. Let us create Outer class instance for creating
        // non-static nested class

        StaticTest staticTest = new StaticTest();


        StaticTest.InnerClass innerClass = staticTest.new InnerClass();


        innerClass.printMess();


        // create instance of nested Static class
        StaticTest.nestedClass  nestedClass = new nestedClass();

        // call non static method of nested static class
        nestedClass.printMsg();
    }

}

package javaprogram.opps;

public class ChildClass extends InheritanceTest {
    public void m1(){
        System.out.println("Child");
    }

    public static void main(String [] args){
        ChildClass childClass = new ChildClass();
        childClass.m1();
        childClass.m2();

        InheritanceTest inheritanceTest = new InheritanceTest();
        inheritanceTest.m1();
        inheritanceTest.m2();

        InheritanceTest inheritanceTest1 =  new ChildClass();
        inheritanceTest1.m1();
        inheritanceTest1.m2();

//        not possible will not create child class object to referance of parent class
//        ChildClass childClass1 = new InheritanceTest();


    }
}

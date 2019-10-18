package javaprogram.common;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

public abstract class FinalTest{
   /* static final String ss;
     final String pp;
   static  {
        ss = "";
    }
    {
        pp ="";
    }

    public final static void main(){
      m1();
    }

    final static private void m1(){
       ss = "";
    }*/

   public static void main(String [] args){
       final int i;
       i=0;
       final StringBuffer ss =  new StringBuffer("vishal");
       System.out.println(ss);

       ss.append("sapna");
       System.out.println(i);
       ImmutableClass immutableClass = new ImmutableClass("v",1);

       System.out.println(immutableClass.getId() + " " + immutableClass.getName());

   }

   final void m1(){

   }

   final int m1(int i){
     return 1 ;
   }
}

package javaprogram.opps;

public class CountObject {

     static int count =0;

     {
        count ++;
    }


    public static void main(String [] args){
        CountObject countObject =  new CountObject();
        CountObject object =  new CountObject();
        System.out.print("number of object created : " +count);
    }
}

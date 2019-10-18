package javaprogram.array;

public class DuplicateElements {
    public static void main(String [] args){
        int count = 0;
        String [] array = {"Vishal","Sapna","Vishal","Sapna","Rinki"};
        for (int i= 0;i<array.length;i++){
            for (int j= i+1;j<array.length;j++){
                if (array[i] .equals(array[j]) && i!= j){
                    System.out.println("duplicate number  " + array[j] );
                }
            }
        }
    }
}

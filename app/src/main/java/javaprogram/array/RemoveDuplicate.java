package javaprogram.array;

public class RemoveDuplicate {

    public static void main(String [] args){
        int [] array = new int [] {10,20,30,40,40,50};
        int length = array.length;
        length = removeDuplicate(array, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(array[i]+" ");
    }



    private static int removeDuplicate(int [] iArray,int length){
        int j =0;
        int temp[] =  new int[length];
        for (int i=0;i<length-1;i++){
            if (iArray[i] != iArray[i+1]){
                temp[j++] = iArray[i];
            }
        }
        temp[j++] =  iArray[length-1];

        // change the orginal array

        for (int i=0;i<j;i++){
            iArray [i] = temp[i];
        }

        return j;
    }
}

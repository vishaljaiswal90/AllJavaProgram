package javaprogram.pattern;

import java.util.Scanner;
public class ThirdPattern {

    public static void main(String [] args){
        System.out.println("How many row you want :");
        Scanner scanner = new Scanner(System.in);
        int row= scanner.nextInt();
        System.out.println("Pattren is ready to print : ");
        for (int i=1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        for (int i=row-1;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.print("\n");
        }


        /*for(int i =1;i<=row-1;i++){
            for(int j= 1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.print("\n");
        }*/
    }
}



//output
/*How many row you want :
        7
        Pattren is ready to print :
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1*/
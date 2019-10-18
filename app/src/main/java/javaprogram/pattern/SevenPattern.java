package javaprogram.pattern;

import java.util.Scanner;

public class SevenPattern {
    public static void main(String [] s){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please Enter number  of row");
        int row=  scanner.nextInt();
        for(int i= 1;i<=row;i++){
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}

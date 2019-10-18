package javaprogram.pattern;

import java.util.Scanner;
public class SecondPattern {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many row you want to print : ");

        int row = scanner.nextInt();

        System.out.println("Now pattern is ready to print ");

        for (int i =1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }

    }
}

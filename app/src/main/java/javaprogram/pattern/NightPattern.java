package javaprogram.pattern;

import java.util.Scanner;

public class NightPattern {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int row = scanner.nextInt();
        for (int i= 1;i<=row;i++){
            if (i%2 == 0){
                for (int j=1;j<=row;j++){
                    if (j%2== 0){
                        System.out.print("1");
                    }else {
                        System.out.print("0");
                    }
                }
                System.out.print("\n");
            }else {
                for (int j=1;j<=row;j++){
                    if (j%2== 0){
                        System.out.print("0");
                    }else {
                        System.out.print("1");
                    }
                }
                System.out.print("\n");
            }

        }
    }
}

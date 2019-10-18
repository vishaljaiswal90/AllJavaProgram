package javaprogram.pattern;

import java.util.Scanner;

public class TenPattern {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int row = scanner.nextInt();
        for (int i= 1;i<=row;i++){
            for (int j = 1;j<=row-i;j++){
                System.out.print("1");
            }for (int k= 1;k<=i;k++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}

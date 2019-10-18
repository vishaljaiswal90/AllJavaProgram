package javaprogram.pattern;

import java.util.Scanner;

public class FirstPattern {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many row you want to print : ");
        int row = scanner.nextInt();
        System.out.println("First pattern");

        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}

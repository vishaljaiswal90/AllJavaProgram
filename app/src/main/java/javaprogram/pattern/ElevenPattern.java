package javaprogram.pattern;

import java.util.Scanner;

public class ElevenPattern {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int row = scanner.nextInt();
        for (int i= 0;i<row;i++){
            for (int j = 0;j<row;j++){
                if (i== j){
                    System.out.print(i);
                }else {
                    System.out.print("0");
                }

            }
            System.out.print("\n");
        }
    }
}

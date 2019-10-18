package javaprogram.pattern;

import java.util.Scanner;
public class EightPattern {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
        int row=  scanner.nextInt();
        for (int i = 1;i<=row;i++){
            for (int s= i-1;s>=1;s--){
                System.out.print(" ");
            }
            for (int j = i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        for (int i= 1;i<row;i++){
            for (int s=1;s<row-i;s++){
                System.out.print(" ");
            }
            for (int j= row-i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }


    }
}


   /* Please enter number
        7
        1 2 3 4 5 6 7
        2 3 4 5 6 7
        3 4 5 6 7
        4 5 6 7
        5 6 7
        6 7
        7
        6 7
        5 6 7
        4 5 6 7
        3 4 5 6 7
        2 3 4 5 6 7
        1 2 3 4 5 6 7 */

package javaprogram.pattern;

import java.util.Scanner;
public class FivePattern {
    public static void main(String [] s){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please Enter number  of row");
        int row=  scanner.nextInt();
        for(int i= row;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for(int i= 2;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

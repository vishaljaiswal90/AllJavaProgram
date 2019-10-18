package javaprogram.pattern;
import java.util.Scanner;

public class fourPattern {
    public static void  main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please enter number of row");
        int row=  scanner.nextInt();

        for (int i =1;i<=row;i++){
            for (int j= row;j>=i;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

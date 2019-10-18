package javaprogram.stringProgram;


import java.util.Scanner;

public class SubString {
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please Enter string for sub string");
         String string = scanner.nextLine();
         char str[] = {'a','b','c'};
         subString(str,str.length);
    }

    private static void subString(char [] string, int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(string[k]);
                }

                System.out.println();
            }
        }

    }
}

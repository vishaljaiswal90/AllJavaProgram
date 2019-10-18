package javaprogram.stringProgram;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfOccurrence {

    public static void main(String [] args){
     Scanner scanner =  new Scanner(System.in);
     System.out.println("Please Enter String");
     String s= scanner.nextLine();

     numberOfOccurrence(s);
    }
    private static void numberOfOccurrence(String s) {
        //Creating a HashMap containing char as a key and occurrences as  a value
        HashMap<Character,Integer> map =  new HashMap<>();
        //Converting given string to char array
         char[] strArray = s.toCharArray();
        //checking each char of strArray
        for (char c : strArray){
            if (map.containsKey(c)){
                //If char is present in charCountMap, incrementing it's count by 1
                map.put(c,map.get(c)+1);
            }else {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value

                map.put(c, 1);
            }
        }
        System.out.println(map);

    }
}

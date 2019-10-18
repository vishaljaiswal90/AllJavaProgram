package javaprogram.stringProgram;

public class CountMaxNumber {
    public static void main(String [] args){
        String s1 = "asbnrcdefgweq";
        String s2 = "aqbnzcdefgpor";
        int count = 0;
        String ss = "";

        for (int i=0;i<s2.length();i++){
            if(count == s2.length())
                break;
            if (s2.charAt(i)== s1.charAt(i)){
                ss = ss+""+s2.charAt(i);
                count ++;
            }
        }

        System.out.print(ss);
    }
    static int maxPrefix(String s,
                         String t)
    {
        int count = 0;

        // Iterating string T.
        for (int i = 0; i < t.length(); i++)
        {
            // If end of string S.
            if (count == t.length())
                break;

            // If character match,
            // increment counter.
            if (t.charAt(i) == s.charAt(count))
                count++;
        }

        return count;
    }
}

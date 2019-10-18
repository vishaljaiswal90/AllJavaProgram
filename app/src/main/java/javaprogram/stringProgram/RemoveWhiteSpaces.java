package javaprogram.stringProgram;

public class RemoveWhiteSpaces {
    static int count =0;
    public static void main(String [] args){
        String str = "vishal love sapna sapna love visahl";

        char [] chars =  str.toCharArray();
        StringBuffer stringBuffer =  new StringBuffer();
        for (int i=0;i<chars.length;i++){
            if ((chars[i] != ' ' ) && (chars[i] != '\t')){

                stringBuffer.append(chars[i]);
            }else {
                ++count;
            }
        }
        System.out.println(stringBuffer);
        System.out.println(count);
    }
}

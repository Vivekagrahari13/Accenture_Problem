package practice;
import java.util.*;

public class ManipulateJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int a=sc.nextInt();
        System.out.println(encodeMessage(s,a));
    }
    public static String encodeMessage(String input1, int input2){
        int sumAscii=0;
        int n=input1.length();
        for (int i = 0; i < n; i++) {
            char ch = input1.charAt(i);
            System.out.println("CHAR: "+ch);
            sumAscii += (int) ch; // Convert char to ASCII and add to sum
        }
        System.out.println(sumAscii);
        if(sumAscii<=input2){
            return input1;
        }
        int idx=n-1;
        while(sumAscii>input2 && n>=0){
            sumAscii-=(int)input1.charAt(idx);
            idx--;
        }
        if(sumAscii<=input2){
            return input1.substring(0,idx+1);
        }
       return "";

    }

}

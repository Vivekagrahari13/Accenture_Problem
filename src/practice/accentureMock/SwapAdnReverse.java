package practice.accentureMock;

import java.util.*;

public class SwapAdnReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s= sc.nextLine();
        String [] words=s.split(" ");
        if(words.length<=2){
            System.out.println("Invalid Length");
            return;
        }
        if (!s.matches("[a-zA-Z ]+")){
            System.out.println(s+" is an invalid sentence");
            return;
        }
        for(int i=1;i< words.length-1;i++){
            words[i]=reverseString(words[i]);
        }
        String output="";
        output=output+words[words.length-1]+" ";
        for(int i= words.length-2;i>0;i--){
            output=output+words[i]+" ";
        }
        output=output+words[0];
        System.out.println(output);

    }
    private static String reverseString(String middle) {
        String reversed = "";
        for (int i = middle.length() - 1; i >= 0; i--) {
            reversed = reversed+middle.charAt(i);
        }
        return reversed;
    }
}

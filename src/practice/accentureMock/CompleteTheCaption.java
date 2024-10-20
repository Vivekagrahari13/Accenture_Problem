package practice.accentureMock;

import java.util.*;

public class CompleteTheCaption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String f=sc.nextLine();
        System.out.println("Enter the second string");
        String s= sc.nextLine();
        if(f.length()!=s.length()){
            System.out.println("Length of the strings "+f+" and "+s+" does not match");
            return;
        }
        String regExp="[a-zA-Z! ]+";
        if(!f.matches(regExp) && !s.matches(regExp)){
            System.out.println(f+ " and "+s+ " contains invalid symbols");
            return;
        }
        if(!f.matches(regExp)){
            System.out.println(f+" contains invalid symbols");
            return;
        }
        if(!s.matches(regExp)){
            System.out.println(s+" contains invalid symbols");
            return;
        }
        char fChar[]=f.toCharArray();
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)=='!'){
               fChar[i]=s.charAt(i);
            }
        }
        String first = new String(fChar);
        System.out.println(first);
    }
}

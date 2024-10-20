package practice;

import java.util.Scanner;

public class FindAllUpperCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String s=sc.next();
            int uppercaseCount = 0;
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    uppercaseCount++;
                }
            }
            System.out.println(uppercaseCount);
        }


    }
}

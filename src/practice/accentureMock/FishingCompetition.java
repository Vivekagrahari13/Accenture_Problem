package practice.accentureMock;

import org.w3c.dom.ls.*;

import java.util.*;

public class FishingCompetition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        String s=sc.nextLine();
        String detail[]=s.split(":");
        String name=detail[0];
        int age=Integer.parseInt(detail[1]);
        if(age<18){
            System.out.println(age+" is an invalid age");
            return;
        }
        int bigFish=Integer.parseInt(detail[2]);
        int medFish=Integer.parseInt(detail[3]);
        int smallFish=Integer.parseInt(detail[4]);

        if(bigFish<0 ){
            System.out.println(bigFish+" is an invalid input");
            return;
        } else if(medFish<0){
            System.out.println(medFish+" is an invalid input");
            return;
        } else if(smallFish<0){
            System.out.println(smallFish+" is an invalid input");
            return;
        }
        int score=bigFish*10+medFish*6+smallFish*3;
        System.out.println(name+" scored "+score+" points");
    }
}

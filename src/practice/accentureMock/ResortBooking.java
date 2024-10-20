package practice.accentureMock;

import java.util.*;

public class ResortBooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customer details");
        String s=sc.nextLine();
        String details[]=s.split(":");
        String name=details[0];
        int numAdult=Integer.parseInt(details[1]);
        int numChild=Integer.parseInt(details[2]);
        int numDays=Integer.parseInt(details[3]);
        if(numAdult<0){
            System.out.println("Invalid input for number of adults");
            return;
        }
        if(numChild<0){
            System.out.println("Invalid input for number of children");
            return;
        }
        if(numDays<=0){
            System.out.println("Invalid input for number of days");
            return;
        }
        int totalCost=(1000*numAdult+650*numChild)*numDays;
        System.out.println(name+" your booking is confirmed and the total cost is "+totalCost);
    }
}

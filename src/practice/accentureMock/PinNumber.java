package practice.accentureMock;

import java.util.*;

public class PinNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of PIN numbers");
        int numPin=sc.nextInt();
        if(numPin<=0){
            System.out.println(numPin+" is an invalid number");
            return;
        }
        HashSet<Integer> validPins=new HashSet<>();
        int n=numPin;
        System.out.println("Enter the PIN numbers");
        while(numPin-->0){
            int pin=sc.nextInt();
            if(String.valueOf(pin).length()!=4){
                System.out.println(pin+" is an invalid PIN number");
                return;
            }
            boolean isValidPin =validatePin(pin);
            if(isValidPin){
                validPins.add(pin);
            }
        }
        if(validPins.isEmpty()){
            System.out.println("All these "+n+" numbers are not a valid PIN number");
//            return;
        }
        else if(validPins.size()>=1){
            System.out.println("Valid PIN numbers are");
            for(int valPin:validPins){
                System.out.println(valPin);
            }
        }
    }
    public static boolean validatePin(int pin){
        String s=String.valueOf(pin);
        int a=Integer.parseInt(""+s.charAt(0));
        int b=Integer.parseInt(""+s.charAt(1));
        int c=Integer.parseInt(""+s.charAt(2));
        int d=Integer.parseInt(""+s.charAt(3));
        if(a<1 || a>9 || a%2==0){
            return false;
        }
        if(b<1 || b>9 ||b%2!=0){
            return false;
        }
        if(c<1||c>9||!isPrime(c)){
            return false;
        }
        if(d<1||d>9||isPrime(d)||d==1){
            return false;
        }
        return true;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

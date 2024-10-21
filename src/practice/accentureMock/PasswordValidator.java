package practice.accentureMock;

import java.util.*;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Generate your password");
        String password=sc.nextLine();
        validatePassword(password);

    }
    public static void validatePassword(String password){
        if(password.length()<6 || password.length()>12){
            System.out.println(password + " is an invalid password");
            return;
        }
        boolean hasUpperCase = false;
        int upCount=0;
        boolean hasLowerCase = false;
        int lowCount=0;
        boolean hasSpecialChar = false;
        int spCharCount=0;
        int digitCount=0;
        String specialCharacters = "@$#*";
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                upCount++;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
                lowCount++;
            } else if (specialCharacters.indexOf(c) >= 0) {
                hasSpecialChar = true;
                spCharCount++;
            } else if(Character.isDigit(c)){
                digitCount++;
            }
        }
        if(hasUpperCase && hasLowerCase && hasSpecialChar){
            System.out.println("The generated password "+password+" is valid and has "+lowCount+" lowercase alphabet "+upCount+" uppercase alphabet "+spCharCount+" special character "+digitCount+" digit");
            return;
        }
        System.out.println(password+" is an invalid password");
    }
}

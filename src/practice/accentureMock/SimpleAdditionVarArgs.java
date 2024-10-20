package practice.accentureMock;

import java.util.*;

public class SimpleAdditionVarArgs {
    public static void main(String[] args) {

        int result1 = addition(10, 15);
        System.out.println("Total " + result1);

        int result2 = addition(20, 25, 15);
        System.out.println("Total " + result2);

        int result3 = addition(10, 20, 30, 40, 50, 70);
        System.out.println("Total " + result3);
    }
    public static int addition(int... a) {
        System.out.println("Number of arguments is " + a.length);
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

}

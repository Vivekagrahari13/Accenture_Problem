package practice;
import java.util.Scanner;
public class MinimumBadness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(minimumBadness(sc.next()));
    }
    public static int minimumBadness(String input) {
        int n = input.length();
        char[] houses = input.toCharArray();
        for (int i = 0; i < n; i++) {
            if (houses[i] == 'W') {
                if (i > 0 && i < n - 1) {
                    if (houses[i - 1] == houses[i + 1]) {
                        houses[i] = houses[i - 1];
                    } else {
                        houses[i] = houses[i - 1];
                    }
                } else if (i == 0) {
                    houses[i] = houses[i + 1];
                } else if (i == n - 1) {
                    houses[i] = houses[i - 1];}
            }}
        int badness = 0;
        for (int i = 0; i < n - 1; i++) {
            if (houses[i] != houses[i + 1]) {
                badness++;
            }
        }
        return badness;
    }
}

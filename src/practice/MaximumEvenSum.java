package practice;

import java.util.*;

public class MaximumEvenSum {

    public static long getMaximumEvenSum(List<Integer> val) {
        long posSum = 0;
        for (int num : val) {
            if (num > 0) {
                posSum += num;
            }
        }
        if (posSum % 2 == 0) {
            return posSum;
        }

        long ans = Long.MIN_VALUE;
        for (int num : val) {
            if (num % 2 != 0) {
                if (num > 0) {
                    ans = Math.max(ans, posSum - num);
                } else {
                    ans = Math.max(ans, posSum + num);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        List<Integer> val = Arrays.asList(2, 3, 6, -5, 10, 1, 1);
        List<Integer> val= Arrays.asList(6, 3, 4, -1, 9, 17);
        long result = getMaximumEvenSum(val);
        System.out.println(+ result);
    }
}

package practice;

import java.util.*;
public class MagicalSum {

    private static long magicalAddition(long a, long b) {
        String concatenated = Long.toString(a) + Long.toString(b);
        return Long.parseLong(concatenated);
    }

    public static List<Long> magicalPairs(int t, List<List<Long>> arr, List<Long> x, List<Long> y) {
        List<Long> result = new ArrayList<>();
        for (int tc = 0;tc < t; tc++) {
            List<Long> currentArr = arr.get(tc);
            long lowerBound = x.get(tc);
            long upperBound = y.get(tc);
            int n = currentArr.size();

            long count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    long magicalSum = magicalAddition(currentArr.get(i), currentArr.get(j));
                    if (magicalSum >= lowerBound && magicalSum <= upperBound) {
                        count++;
                    }
                }
            }
            result.add(count);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        List<List<Long>> arr = new ArrayList<>();
        List<Long> x = new ArrayList<>();
        List<Long> y = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            List<Long> currentArr = new ArrayList<>();
            String[] input = sc.nextLine().split(" ");

            for (String item : input) {
                currentArr.add(Long.parseLong(item));
            }
            arr.add(currentArr);

            String[] bounds = sc.nextLine().split(" ");
            x.add(Long.parseLong(bounds[0]));
            y.add(Long.parseLong(bounds[1]));
        }

        List<Long> result = magicalPairs(t, arr, x, y);
        for (long res : result) {
            System.out.println(res);
        }

        sc.close();
    }
}


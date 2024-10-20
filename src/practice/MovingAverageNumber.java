package practice;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingAverageNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }
        int K=sc.nextInt();
        System.out.println(smoothData(ar,K));
    }
    public static List<Float> smoothData(List<Integer> ar, int k) {
        int n = ar.size();
        List<Float> smoothed = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");

        if (k <= 0 || n < k) {
            smoothed.add(-1.0f);
            return smoothed;
        }

        for (int i = 0; i <= n - k; i++) {
            float sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += ar.get(j);
            }
            float average = sum / k;
            String formatted = df.format(average); // Formatting the float average
            float smoothedValue = Float.parseFloat(formatted); // Parsing the formatted string to float
            smoothed.add(smoothedValue);
        }
      return smoothed;
    }

}

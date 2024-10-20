package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StaticAnalysisCalculation {

    public static void main(String[] args) {
        List<Double> data=new ArrayList<>();
        data.add(4.0);
        data.add(14.0);
        data.add(6.0);
        data.add(10.0);
        data.add(17.0);
        //data.add(8.0);
        data.add(17.0);
        System.out.println(calculateVariance(data));
        System.out.println(calculateMode(data));
        System.out.println(calculateMedian(data));
    }
    /**
     * Calculates the variance of a list of doubles.
     * Variance measures how far a set of numbers are spread out from their average value.
     * Formula:
     * 1. Calculate the mean (average) of the data set:
     *    mean = (Σx) / N
     *    where Σx is the sum of all data points and N is the number of data points.
     * <p>
     * 2. Calculate the squared difference from the mean for each data point:
     *    squaredDifference = (x - mean)²
     * <p>
     * 3. Calculate the average of these squared differences:
     *    variance = (ΣsquaredDifference) / N
     *    where ΣsquaredDifference is the sum of all squared differences and N is the number of data points.
     *
     * @param data List of doubles for which variance is to be calculated.
     * @return The variance of the data set. Returns NaN if the data set is empty.
     */
    public static double calculateVariance(List<Double> data) {
        double average = data.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        return data.stream().mapToDouble(v -> Math.pow(v - average, 2)).average().orElse(Double.NaN);
    }

    /**
     * Calculates the mode (most frequent value) of a list of doubles.
     * Mode is the value that appears most frequently in a data set.
     * <p>
     * Formula:
     * 1. Count the frequency of each distinct value in the data set.
     * 2. Find the value with the maximum frequency.
     *
     * @param data List of doubles for which mode is to be calculated.
     * @return The mode of the data set. If multiple values have the same maximum frequency, returns the smallest of these values.
     */
    public static  double calculateMode(List<Double> data) {
        Map<Double, Long> frequencyMap = data.stream().collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        return frequencyMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    /**
     * Calculates the median of a list of doubles.
     * Median is the middle value of a sorted list of numbers. If the list has an odd number
     * of values, the median is the middle one. If the list has an even number of values,
     * the median is the average of the two middle values.
     * Formula:
     * 1. Sort the data set in ascending order.
     * 2. If the size of the data set is odd, return the middle value.
     * 3. If the size of the data set is even, return the average of the two middle values.
     *
     * @param data List of doubles for which median is to be calculated.
     * @return The median of the data set.
     */
    public static double calculateMedian(List<Double> data) {
        List<Double> sortedData = new ArrayList<>(data);
        Collections.sort(sortedData);
        int size = sortedData.size();
        if (size % 2 == 0) {
            return (sortedData.get(size / 2 - 1) + sortedData.get(size / 2)) / 2.0;
        } else {
            return sortedData.get(size / 2);
        }
    }
}

package practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleRounfOffTwoDecimalPlaces {
    public static void main(String[] args) {
        System.out.println(roundToTwoDecimalPlaces(0.456789034));
    }

    public static Double roundToTwoDecimalPlaces(Double value) {
//        if (value == null) {
//            return null;
//        }
//        return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP);
        if (value == null) {
            return null;
        }
        return Double.valueOf(String.format("%.2f", value));
    }
}

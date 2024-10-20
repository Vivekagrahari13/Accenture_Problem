package practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class StringValidate {
    public static void main(String[] args) {
        String rep="TAF ICAO 072300Z ACgh ducjdnc";
        System.out.println(validateTafReport(rep));
    }
    private static String validateTafReport(String report) {
        String[] parts = report.split(" ");
        int indexToUpdate = (report.contains("COR") || report.contains("AMD")) ? 3 : 2;
        // Update the timestamp part
        parts[indexToUpdate] = generateTimestamp();
        // Join the parts back into a single string
        return String.join(" ", parts);
    }
    private static String generateTimestamp() {
        return String.format("%02d%02d%02dZ",
                LocalDate.now().getDayOfMonth(),
                LocalTime.now().getHour(),
                LocalTime.now().getMinute());
    }
}

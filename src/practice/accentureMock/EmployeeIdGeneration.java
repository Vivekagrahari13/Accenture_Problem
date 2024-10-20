package practice.accentureMock;

import java.util.*;

public class EmployeeIdGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the training id");
        String s = sc.nextLine();
        validateTrainingIdAndGenerateValidEmployeeId(s);
    }

    private static void validateTrainingIdAndGenerateValidEmployeeId(String s) {
        if (s.length() < 9) {
            System.out.println(s + " is an invalid training id");
            return;
        }
        String year = s.substring(0, 4);
        if (!year.equals("2021")) {
            System.out.println(year + " is an invalid year");
            return;
        }
        String teamCode = s.substring(4, 6);
        String teamName;
        switch (teamCode) {
            case "01":
                teamName = "LP";
                break;
            case "02":
                teamName = "TA";
                break;
            case "03":
                teamName = "CT";
                break;
            case "04":
                teamName = "PT";
                break;
            case "05":
                teamName = "TT";
                break;
            default:
                System.out.println(teamCode + " is an invalid team code");
                return;
        }
        String rollNum = s.substring(6, s.length());
        int roll = Integer.parseInt(rollNum);
        if (roll < 1 || roll > 999) {
            System.out.println(rollNum + " is an invalid roll number");
            return;
        }
        String employeeId = "SIET" + teamName + rollNum;
        System.out.println("Employee Id: "+employeeId);

    }
}

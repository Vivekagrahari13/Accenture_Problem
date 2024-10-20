package practice.accentureMock;

import java.util.*;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the city name");
        String userCity=sc.nextLine();
        HashSet<String> availableCity=new HashSet<>();
        availableCity.add("Chennai");
        availableCity.add("Coimbatore");
        availableCity.add("Erode");
        availableCity.add("Karur");
        availableCity.add("Madurai");
        availableCity.add("Hyderabad");
        availableCity.add("Salem");
        availableCity.add("Bangalore");
        availableCity.add("Delhi");
        availableCity.add("Agra");

        boolean isCityAvailable = false;
        for (String city : availableCity) {
            if (city.equalsIgnoreCase(userCity)) {
                isCityAvailable = true;
                break;
            }
        }
        if (isCityAvailable) {
            System.out.println("Bus for " + userCity + " is available");
        } else {
            System.out.println("Bus for " + userCity + " is not available");
        }
    }
}

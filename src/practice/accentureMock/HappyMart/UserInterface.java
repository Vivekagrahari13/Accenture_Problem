package practice.accentureMock.HappyMart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the products count");
        int count = sc.nextInt();
        sc.nextLine();
        if (count <= 0) {
            System.out.println("Invalid count");
            return;
        }

        ArrayList<Product> productList = new ArrayList<>();

        System.out.println("Enter Product details");
        for (int i = 0; i < count; i++) {
            String productDetails = sc.nextLine();
            String[] details = productDetails.split(":");

            int productId = Integer.parseInt(details[0]);
            String productName = details[1];
            double price = Double.parseDouble(details[2]);
            productList.add(new Product(productId, productName, price));
        }

        System.out.println("1.Sort By Id");
        System.out.println("2.Sort By Price");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Collections.sort(productList, new SortById());
                System.out.println("After Sorting By Id");
                break;
            case 2:
                Collections.sort(productList, new SortByPrice());
                System.out.println("After Sorting By Price");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}

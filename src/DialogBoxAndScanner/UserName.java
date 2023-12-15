package DialogBoxAndScanner;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();
        scanner.close();
        System.out.println("Uppercase: " + (firstName + " " + lastName).toUpperCase());
        System.out.println("Lowercase: " + (firstName + " " + lastName).toLowerCase());
        System.out.println("Reverse Order: " + lastName + " " + firstName);
    }
}
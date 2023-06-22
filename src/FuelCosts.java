import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gasGal;
        double fuelCons;
        double gasCost;

        // Input for number of gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gasGal = scanner.nextDouble();
                break;
            }
            else{
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }

        }
        while (true);

        // Input for fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelCons = scanner.nextDouble();
                break;
            }
            else{
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }

        } while (true);

        // Input for price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                gasCost = scanner.nextDouble();
                break;
            }
            else{
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }

        } while (true);

        // Perform calculations
        double costPer100miles = gasGal * gasCost;
        double distancePer100miles = gasGal * fuelCons;

        // Output the results
        System.out.println("Total cost of gas per 100miles: $" + costPer100miles);
        System.out.println("Maximum distance that can be traveled: " + distancePer100miles + " miles");

        scanner.close();
    }
}

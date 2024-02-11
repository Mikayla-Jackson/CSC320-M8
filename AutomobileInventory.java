import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Automobile> inventory = new ArrayList <>();

        try {
            // Call automobile class with parameterized constructor
            String make = "Subaru";
            String model = "Forester";
            String color = "Black";
            int year = 2008;
            int mileage = 100000;
            extracted(inventory, make, model, color, year, mileage);

            // Call the method to list the values
            String[] vehicleInfo = inventory.get(0).listVehicleInformation();
            System.out.println("Vehicle Information:");
            for (String info : vehicleInfo) {
                System.out.println(info);
        }

        //Call the remove vehicle method to clear the variables
        String removeResult = inventory.get(0).removeVehicle();
        System.out.println(removeResult);

        //Add a new vehicle
        System.out.println("Enter vehicle details:");
            System.out.print("Make: ");
            make = scanner.nextLine();
            System.out.print("Model: ");
            model = scanner.nextLine();
            System.out.print("Color: ");
            color = scanner.nextLine();
            System.out.print("Year: ");
            year = scanner.nextInt();
            System.out.print("Mileage: ");
            mileage = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String addResult = inventory.get(0).addVehicle(make, model, color, year, mileage);
            System.out.println(addResult);

        //Call the list method and print new vehicle information to the screen
        String[] newVehicleInfo = inventory.get(0).listVehicleInformation();
        System.out.println("New vehicle information: ");
        for (String info : newVehicleInfo) {
            System.out.println(info);
        }

        //Update the vehicle
        System.out.println("Enter updated vehicle details:");
            System.out.print("Make: ");
            make = scanner.nextLine();
            System.out.print("Model: ");
            model = scanner.nextLine();
            System.out.print("Color: ");
            color = scanner.nextLine();
            System.out.print("Year: ");
            year = scanner.nextInt();
            System.out.print("Mileage: ");
            mileage = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            String updateResult = inventory.get(0).updateVehicleAttributes(make, model, color, year, mileage);
            System.out.println(updateResult);


        //Call the listing method and print the information to the screen
        String[] updateVehicleInfo = inventory.get(0).listVehicleInformation();
        System.out.println("Updated Vehicle Information:");
        for (String info : updateVehicleInfo) {
            System.out.println(info);
        }

        //Ask if user wants to print the information to a file
        System.out.println("Do you want to print the vehicle information to a file? (Y/N)");
        // Use scanner to capture response
        String response = scanner.nextLine().toUpperCase();

        // Assume the response is "Y" for testing
        if (response.equalsIgnoreCase("Y")) {
            inventory.get(0).printToFile("C:\\Temp\\Autos.txt");
            System.out.println("Vehicle information printed to file.");
        } else if (response.equals("N")) {
            System.out.println("Vehicle Information will not be printed to file.");
        } else {
            System.out.println("Invalid input. Vehicle information will not be printed to a file.");
        }
    } catch (InputMismatchException exception) {
        System.out.println("Invalid input. Exiting the program.");
    } finally {
        if (scanner != null) {
            scanner.close();
        }
    }
}

    private static boolean extracted(List<Automobile> inventory, String make, String model, String color, int year,
            int mileage) {
        return inventory.add(new Automobile(make, model, color, year, mileage));
    }
}


    

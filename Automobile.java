import java.io.FileWriter;
import java.io.IOException;

public class Automobile {
    //Attributes
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Add a new vehicle method
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } 
        catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // List vehicle information
    public String[] listVehicleInformation() {
        String[] vehicleinfo = {make, model, color, String.valueOf(year), String.valueOf(mileage)};
        return vehicleinfo;
    }

    // Remove a vehicle method
    public String removeVehicle(String autoMake, String autoModel, String autoColor, int autoYear) {
        try {
            // Check if provided values match stored vehicle information
            if (make.equals(autoMake) && model.equals(autoModel) && color.equals(autoColor) && year == autoYear) {
                // Clearing stored vehicle information
            this.make = null;
            this.model = null;
            this.color = null;
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } else {
            return "No matching vehicle found.";
        }
    } catch (Exception e) {
        return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes method
    public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle attributes updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle attributes: " + e.getMessage();
        }
    }

    //Method to print vehicle information to file 
    public void printToFile(String filepath) {
        try (FileWriter writer = new FileWriter(filepath)) {
            String[] vehicleInfo = listVehicleInformation();
            for (String info : vehicleInfo) {
                writer.write(info + "\n");
            }
            System.out.println("Vehicle information printed to file: " + filepath);
        } catch (IOException exception) {
            System.out.println("Failed to print vehicle information to file: " + exception.getMessage());
        }
    }

    public String removeVehicle(String make2, String model2, String color2, int year2, int mileage2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeVehicle'");
    }

    public String removeVehicle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeVehicle'");
    }

	}




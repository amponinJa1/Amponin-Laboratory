package Act2;
import java.util.Scanner;

    // BASE CLASS : VEHICLE
    class Vehicle {
        private String brand;
        private double speed;
        private String fuelType;

        // CONSTRUCTOR
        public void Vehicle(String brand, double speed, String fuelType) {
            this.brand = brand;
            this.speed = speed;
            this.fuelType = fuelType;
        }

        // ENCAPSULATION - GETTER AND SETTER METHOD
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        // DISPLAY VEHICLE DETAILS
        public void displayVehicleDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed + " km/h");
            System.out.println("Fuel Type: " + fuelType);
        }
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    // CAR SUBCLASS (EXTENDS VEHICLE)
    class Car extends Vehicle {
        private int numDoors;

        // CONSTRUCTOR
        public Car(String brand, double speed, String fuelType, int numDoors) {
            super();
            this.numDoors = numDoors;
        }

        // GETTER AND SETTER METHOD FOR NUMDOORS
        public int getNumDoors() {
            return numDoors;
        }

        public void setNumDoors(int numDoors) {
            this.numDoors = numDoors;
        }

        @Override
        public void displayVehicleDetails() {
            super.displayVehicleDetails();
            System.out.println("Number of Doors: " + numDoors);
        }
    }

    //---------------------------------------------------------------------------------------------------------------------------------------

    // MOTOR SUBCALSS(EXTENDS VEHICLE)
    class Motorcycle extends Vehicle {
        private boolean hasSidecar;

        // CONSTRUCTOR
        public Motorcycle(String brand, double speed, String fuelType, boolean hasSidecar) {
            super();
            this.hasSidecar = hasSidecar;
        }

        // GETTER AND SETTER METHOD FOR HASSIDECAR
        public boolean hasSidecar() {
            return hasSidecar;
        }

        public void setHasSidecar(boolean hasSidecar) {
            this.hasSidecar = hasSidecar;
        }

        @Override
        public void displayVehicleDetails() {
            super.displayVehicleDetails();
            System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        }
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    // MC - TestVehicle (MAIN CLASS)
    public class TestVehicle {
        public static void main(String[] args) {
            Scanner drei = new Scanner(System.in);

            // CAR DETAILS
            System.out.println("Enter Car Details:");
            System.out.print("Brand: ");
            String carBrand = drei.nextLine();
            
            System.out.print("Speed (km/h): ");
            double carSpeed = drei.nextDouble();
            drei.nextLine(); 
            
            System.out.print("Fuel Type: ");
            String carFuelType = drei.nextLine();
            
            System.out.print("Number of Doors: ");
            int carNumDoors = drei.nextInt();
            drei.nextLine(); 

            // MOTOR DETAILS
            System.out.println("\nEnter Motorcycle Details:");
            System.out.print("Brand: ");
            String motorcycleBrand = drei.nextLine();
            
            System.out.print("Speed (km/h): ");
            double motorcycleSpeed = drei.nextDouble();
            drei.nextLine(); 
            
            System.out.print("Fuel Type: ");
            String motorcycleFuelType = drei.nextLine();
            
            System.out.print("Has Sidecar (true/false): ");
            boolean motorcycleHasSidecar = drei.nextBoolean();
            
            // MOTOR & CAR OBJECTS
            Car car = new Car(carBrand, carSpeed, carFuelType, carNumDoors);
            Motorcycle motorcycle = new Motorcycle(motorcycleBrand, motorcycleSpeed, motorcycleFuelType, motorcycleHasSidecar);

            // DISPLAY CAR & MOTOR DETAILS
            System.out.println("\nCar Details:");
            car.displayVehicleDetails();

            System.out.println("\nMotorcycle Details:");
            motorcycle.displayVehicleDetails();

            // CS- CLOSE SCANNER
            drei.close();
        }
    }
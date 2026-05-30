package Oops;
import java.util.Scanner;

// Parent Class
class UberOverride {

    void calculateFare(double kms) {
        System.out.println("Calculating fare...");
    }
}

// Child Class - Car
class Car extends UberOverride {

    @Override
    void calculateFare(double kms) {
        double amount = kms * 15;
        System.out.println("Car Ride Booked");
        System.out.println("Distance: " + kms + " km");
        System.out.println("Amount to Pay: ₹" + amount);
    }
}

// Child Class - Bike
class Bike extends UberOverride {

    @Override
    void calculateFare(double kms) {
        double amount = kms * 8;
        System.out.println("Bike Ride Booked");
        System.out.println("Distance: " + kms + " km");
        System.out.println("Amount to Pay: ₹" + amount);
    }
}

// Child Class - Auto
class Auto extends UberOverride {

    @Override
    void calculateFare(double kms) {
        double amount = kms * 10;
        System.out.println("Auto Ride Booked");
        System.out.println("Distance: " + kms + " km");
        System.out.println("Amount to Pay: ₹" + amount);
    }
}

// Main Class
public class UberMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UBER RIDE BOOKING =====");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Auto");

        System.out.print("Choose Vehicle: ");
        int choice = sc.nextInt();

        System.out.print("Enter Distance (km): ");
        double kms = sc.nextDouble();

        UberOverride ride;

        switch (choice) {
            case 1:
                ride = new Car();
                break;

            case 2:
                ride = new Bike();
                break;

            case 3:
                ride = new Auto();
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        ride.calculateFare(kms);

        sc.close();
    }
}
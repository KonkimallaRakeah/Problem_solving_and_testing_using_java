import java.util.*;

abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    int calculateFare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    int calculateFare(int distance) {
        return distance * 12;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Trip {
    Driver driver;
    Rider rider;
    Vehicle vehicle;

    Trip(Driver driver, Rider rider, Vehicle vehicle) {
        this.driver = driver;
        this.rider = rider;
        this.vehicle = vehicle;
    }

    int getFare(int distance) {
        return vehicle.calculateFare(distance);
    }
}

public class Ride_Sharing_PS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Driver driver = new Driver("Driver1");
        Rider rider = new Rider("Rider1");

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            try {
                Vehicle vehicle;

                if (type.equals("Bike")) {
                    vehicle = new Bike();
                } else if (type.equals("Auto")) {
                    vehicle = new Auto();
                } else if (type.equals("Cab")) {
                    vehicle = new Cab();
                } else {
                    throw new Exception("Invalid ride type");
                }

                Trip trip = new Trip(driver, rider, vehicle);
                System.out.println(trip.getFare(distance));

            } catch (Exception e) {
                System.out.println("Invalid booking");
            }
        }

        sc.close();
    }
}
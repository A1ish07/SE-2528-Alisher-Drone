# SE-2528-Alisher-Drone

## What the product is
My project demonstrates the Builder Design Pattern using the example of a class Drone.  
Product drone that can be built in two different variations: Expensive and Cheap.

## How to build each representation
ExpensiveDroneBuilder — builds a high-quality drone with longer flight time, lighter weight, and higher speed.  
CheapDroneBuilder — builds a low-cost drone with limited specifications.  

Example usage:
```java
public class Main {
    public static void main(String[] args) {
        Drone expensive = new ExpensiveDroneBuilder()
                .addModelName("DJI Mavic 4 Pro")
                .addFlightTime(52)
                .addWeight(1.0)
                .addMaxSpeed(90)
                .build();

        Drone cheap = new CheapDroneBuilder()
                .addModelName("E88")
                .addFlightTime(15)
                .addWeight(0.2)
                .addMaxSpeed(25)
                .build();

        System.out.println("Expensive Drone: " + expensive);
        System.out.println("Cheap Drone: " + cheap);
    }
}

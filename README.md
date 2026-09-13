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
```

## UML Diagram


![UML Diagram](https://www.plantuml.com/plantuml/png/bP3FIWCn4CRlUOevhiZs0Of8yO-tzLB1SzfyRGUIsIN9Qa5zTvkaBOHr3vuIllncVZDPXQXz79rLMwj3e2VV2-XB4RNaUWFxgXreIUleMVOvtbdU7-8Rvvmbvl0JAJm5fXyt5gLU7zS3OCxOZrAd0twdjoYUXv6jWS-wMzB6T1TZKtmtjAp82_To7Q5XYNFKEnBLb8dceEuyv6oZJRetrwUqHlcgv-C02Vo1QXTsWuM3n52tAZMF1-ZX7todMPIg2kw-5uk_tLDkwbEf8xNjVMrRGSpex2y0)

www.plantuml.com/plantuml/png/bP3FIWCn4CRlUOevhiZs0Of8yO-tzLB1SzfyRGUIsIN9Qa5zTvkaBOHr3vuIllncVZDPXQXz79rLMwj3e2VV2-XB4RNaUWFxgXreIUleMVOvtbdU7-8Rvvmbvl0JAJm5fXyt5gLU7zS3OCxOZrAd0twdjoYUXv6jWS-wMzB6T1TZKtmtjAp82_To7Q5XYNFKEnBLb8dceEuyv6oZJRetrwUqHlcgv-C02Vo1QXTsWuM3n52tAZMF1-ZX7todMPIg2kw-5uk_tLDkwbEf8xNjVMrRGSpex2y0



## Structure
```
src/
  Main.java                  - client demo
  Drone.java                 - product
  DroneBuilder.java          - builder interface
  ExpensiveDroneBuilder.java - concrete builder 1
  CheapDroneBuilder.java     - concrete builder 2
```

## ~Alimbayev Alisher

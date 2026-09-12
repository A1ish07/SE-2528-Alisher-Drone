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

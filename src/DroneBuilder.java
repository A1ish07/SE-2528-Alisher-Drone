public interface DroneBuilder {
    DroneBuilder addModelName(String modelName);
    DroneBuilder addFlightTime(int flightTime);
    DroneBuilder addWeight(double weight);
    DroneBuilder addMaxSpeed(int maxSpeed);
    Drone build();

}

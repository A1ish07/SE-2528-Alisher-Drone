public class CheapDroneBuilder implements DroneBuilder {
    private String modelName;
    private int flightTime;
    private double weight;
    private int maxSpeed;

    @Override
    public DroneBuilder addModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    @Override
    public DroneBuilder addFlightTime(int flightTime) {
        this.flightTime = flightTime;
        return this;
    }

    @Override
    public DroneBuilder addWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public DroneBuilder addMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    @Override
    public Drone build() {
        return new Drone(modelName, flightTime, weight, maxSpeed);
    }
}

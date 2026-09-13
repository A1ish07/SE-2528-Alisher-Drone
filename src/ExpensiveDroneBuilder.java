public class ExpensiveDroneBuilder implements DroneBuilder {
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
        if (modelName == null) {
            throw new IllegalStateException("No model name");
        }
        if (flightTime <= 0) {
            throw new IllegalStateException("Flight time > 0");
        }
        if (weight <= 0) {
            throw new IllegalStateException("Weight > 0");
        }
        if (maxSpeed <= 0) {
            throw new IllegalStateException("Speed > 0");
        }

        return new Drone(modelName, flightTime, weight, maxSpeed);
    }
}

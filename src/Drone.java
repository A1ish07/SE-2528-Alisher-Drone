public class Drone {
    private String modelName;
    private int flightTime;
    private double weight;
    private int maxSpeed;

    public Drone(String modelName,int flightTime, double weight,int maxSpeed){
        this.modelName = modelName;
        this.flightTime = flightTime;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString(){
        return "Model Name = " + modelName + ", Flight Time = " + flightTime + " min " + ", Weight = " +
                weight + " kg" + ", Max Speed=" + maxSpeed + "km/h";
    }
}

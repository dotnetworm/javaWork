public class ElectricVehicle extends Vehicle {
    private double range;
    private double electricConsumption;

    public ElectricVehicle(double weightC, double maxSpeedC, double electricConsumptionC, double rangeC){
        super.weight = weightC;
        super.maxSpeed = maxSpeedC;
        this.range = rangeC;
        this.electricConsumption = electricConsumptionC;
        
    }
    
    public double getRange(){
        return range;
    }

    public double getElectricConsumption(){
        return electricConsumption;
    }
}

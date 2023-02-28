public class ICEVehicle extends Vehicle{
    public double fuelconsumption;

    public ICEVehicle(double weightC, double maxSpeedC, double fuelconsumptionC){
        super.weight = weightC;
        super.maxSpeed = maxSpeedC;
        this.fuelconsumption = fuelconsumptionC;
    }

    public double getConsumption(){
        return fuelconsumption;
    }
}

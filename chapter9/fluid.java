public abstract class fluid{
    public double density; // kg/m^3
    public double d_viscosity; // Pa.s
    public double k_viscosity; // cSt
    public double thermCond; // W/m-K
    public double temp; // K
    public double press; //Pa
    public phase fluidPhase; //LIQUID,SOLID,TWOPHASE

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }
}
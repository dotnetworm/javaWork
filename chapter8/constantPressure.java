public class constantPressure extends calculateEnergy {
    public double P;
    public double v1;
    public double v2;

    public constantPressure(double mass, double pressure, double sv1, double sv2){
        super.m = mass;
        this.P = pressure;
        this.v1 = sv1;
        this.v2 = sv2;
    }

    public double getFirstEnthalpy(){
        return (double)(P*v1);
    }
    public double getSecondEnthalpy(){
        return  (double)(P*v2);
    }
}

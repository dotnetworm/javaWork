
public class equations implements constants{
    public static double potentialEnergy(double m, double h){
        return (m*g*h);
    }
    public static double kineticEnergy(double m, double v){
        return (0.5*m*Math.pow(v,2));
    }
    public static double internalEnergy(double U){
        return U;
    }
}
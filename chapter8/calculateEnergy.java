public abstract class calculateEnergy {
    public double H_first;
    public double H_second;
    public double m;

    public abstract double getFirstEnthalpy();
    public abstract double getSecondEnthalpy();

    public double energy(){
        H_first = getFirstEnthalpy();
        H_second = getSecondEnthalpy();
        return (double)((H_first - H_second));
    }
}

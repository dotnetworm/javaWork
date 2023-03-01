public class freeEnthalpy extends calculateEnergy {
    public freeEnthalpy(double mass, double h1, double h2){
        super.m = mass;
        super.H_first = h1;
        super.H_second = h2;
    }

    public double getFirstEnthalpy(){
        return (double)(H_first);
    }
    public double getSecondEnthalpy(){
        return  (double)(H_second);
    }
}

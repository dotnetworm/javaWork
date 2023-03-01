public class potentialEnergy implements environmentalVariables {
    private double m;
    private double h;

    public potentialEnergy(double mass, double height){
        this.m = mass;
        this.h = height;
    }

    public double energy(){
        return (double)(m*g*h);
    }
}

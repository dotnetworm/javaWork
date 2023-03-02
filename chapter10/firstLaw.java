public class firstLaw {
    public static void main(String[] args) {
        double m = 4.5; // kg
        double h = 2.5; //m
        double v = 3.25; //m/s
        double PE = equations.potentialEnergy(m,h);
        double KE = equations.kineticEnergy(m,v);
        System.out.println(String.format("The Potential Energy is %.2f J.", PE));
        System.out.println(String.format("The Kinectic Energy is %.2f J.", KE));
        System.out.println(String.format("The Potential Energy is %.2f J and the kinetic energy is %.3f J.", PE, KE));

    }
}

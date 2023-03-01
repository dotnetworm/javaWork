public class enthalpyCalculator {
    public static void main(String[] args) {
        double pressure = 100000;
        double mass = 5;
        double v1 = 0.00003;
        double v2 = 0.00002;
        double h1 = 55;
        double h2 = 45;
        double height = 3.44;

        constantPressure enthCal = new constantPressure(mass,pressure,v1,v2);
        System.out.println(enthCal.energy());
        freeEnthalpy enthCal2 = new freeEnthalpy(mass, h1,h2);
        System.out.println(enthCal2.energy());
        potentialEnergy enCal = new potentialEnergy(mass, height);
        System.out.println(enCal.energy());
    }
}

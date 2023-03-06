import java.util.HashMap;

public class coolant extends fluid{

    private HashMap<String, Double> density = new HashMap<>();
    private HashMap<String, Double> enthalpy = new HashMap<>();


    private void setDensityMap(double denRefTemp, double denRefPres,double denRefden,double denCoeffa1,double denCoeffa2,double denCoeffa3,double denCoeffa4,double denCoeffa5, double denCoeffa6){
        density.put("denRefTemp",denRefTemp);
        density.put("denRefPres",denRefPres);
        density.put("denRefden",denRefden);
        density.put("denCoeffa1",denCoeffa1);
        density.put("denCoeffa2",denCoeffa2);
        density.put("denCoeffa3",denCoeffa3);
        density.put("denCoeffa4",denCoeffa4);
        density.put("denCoeffa5",denCoeffa5);
        density.put("denCoeffa6",denCoeffa6);

    }
    private void setEnthalpyMap(double enthRefTemp, double enthRefPres,double enthRefenth,double enthRefa1,double enthRefa2,double enthRefa3){
        enthalpy.put("enthRefTemp",enthRefTemp);
        enthalpy.put("enthRefPres",enthRefPres);
        enthalpy.put("enthRefenth",enthRefenth);
        enthalpy.put("enthRefa1",enthRefa1);
        enthalpy.put("enthRefa2",enthRefa2);
        enthalpy.put("enthRefa3",enthRefa3);
    }

    private double getDensity(double T, double P){
        double den;
        if(T > this.limits)
        return den;
    }
}

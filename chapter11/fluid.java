import java.util.HashMap;

public abstract class fluid {
    private String name;
    private HashMap<String, Double> limits = new HashMap<>();

    public void setName(String fluidName){
        this.name = fluidName;
    };
    public void setLimits(double minTemp, double maxTemp, double minPres, double maxPres){
        limits.put("minTemp", minTemp);
        limits.put("maxTemp", maxTemp);
        limits.put("minPres", minPres);
        limits.put("maxPres", maxPres);
    }


}

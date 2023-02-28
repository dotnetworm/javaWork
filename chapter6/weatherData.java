public class weatherData {
    private String location;
    private double temperature;
    private String date;
    private String time;

    public void setLoc(String loc){
        location = loc;
    }

    public void setTemp(double temp){
        temperature = temp;
    }

    public void setDate(String dateinfo){
        date = dateinfo;
    }

    public void setTime(String timeInfo){
        time = timeInfo;
    }

    public String getLoc(){
        return location;
    }

    public double getTemp(){
        return temperature;
    }

    public String getdate(){
        return date;
    }

    public String getTime(){
        return time;
    }

}

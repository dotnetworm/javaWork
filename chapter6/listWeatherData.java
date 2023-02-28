import java.util.ArrayList;

public class listWeatherData {
    public static void main(String[] args) {
        weatherData weat1 = new weatherData();
        weat1.setLoc("Nuneaton, Warwickshire, UK");
        weat1.setTemp(6.5);
        weat1.setDate("21/03/2023");
        weat1.setTime("06:30 AM");
        weatherData weat2 = new weatherData();
        weat2.setLoc("Nuneaton, Warwickshire, UK");
        weat2.setTemp(15.4);
        weat2.setDate("22/03/2023");
        weat2.setTime("07:35 AM");
        weatherData weat3 = new weatherData();
        weat3.setLoc("Nuneaton, Warwickshire, UK");
        weat3.setTemp(11.8);
        weat3.setDate("23/03/2023");
        weat3.setTime("05:45 AM");
        ArrayList<weatherData> weatherList = new ArrayList<weatherData>();
        weatherList.add(weat1);
        weatherList.add(weat2);
        weatherList.add(weat3);

        if(weatherList.isEmpty()){
            System.out.println("There is no data stored in database.");
        } else {
            double sumTemp = 0;
            System.out.println("######################################################################################");
            System.out.println("#####                              THE WEATHER DATABASE                          #####");
            System.out.println("#####                               Written by E.SOYLU                           #####");
            System.out.println("######################################################################################");
            System.out.println("There is "+weatherList.size()+" item located in database");
            for(weatherData i:weatherList){
                System.out.println("The Air temperature for "+i.getLoc()+" is "+ i.getTemp()+"°C at " + i.getdate() + " - "+i.getTime()+".");
                sumTemp = sumTemp + i.getTemp();
            }
            double meanTemp = sumTemp / weatherList.size();
            System.out.println("The mean temperature of the database is " + String.format("%,.2f", meanTemp) + "°C.");
        }
    }
}

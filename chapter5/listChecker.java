package chapter5;

public class listChecker {
    private int[] series;

    public void setListValues(int[] values){
        series = values;
    }

    public void getListValues(){
        for(int i:series){
            System.out.println("One of the defined values is" + String(i));
        }
    }
}

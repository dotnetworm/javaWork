public class listChecker {
    private int[] series;
    private int upperLimit;

    public void setListValues(int[] values){
        series = values;
    }

    public void setUpperLimit(int limit){
        upperLimit = limit;
    }
    public void getListValues(){
        for(int i:series){
            System.out.println("One of the defined values is " + i);
        }
    }

    public void countUp(){
        for(int i =0; i<=upperLimit; i++){
            System.out.println("I am counting: "+ i);
        }
    }
}

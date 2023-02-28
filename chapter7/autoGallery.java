import java.util.ArrayList;

public class autoGallery {
    public static void main(String[] args) {
        ArrayList<Vehicle> monthlyList = new ArrayList<Vehicle>();
        ElectricVehicle model3 = new ElectricVehicle(2149, 1400, 232, 308);
        ICEVehicle volvoS40 = new ICEVehicle(1339, 210, 42);
        monthlyList.add(model3);
        monthlyList.add(volvoS40);

        for(Vehicle i:monthlyList){
            System.out.println(i.weight);
        }
    }
}

import java.util.Scanner;

public class selection {
    private String substance;

    public static int menu(){
        System.out.println("############################################################################");
        System.out.println("#####                       PLEASE SELECT SUBSTANCE                    #####");
        System.out.println("#####              1. Ethylen Glycole - Water Mixture (50-50)          #####");
        System.out.println("############################################################################");
        System.out.println();
        System.out.print("Please Enter the Substance number from list: ");
        Scanner input = new Scanner(System.in);
        try {
            int j = Integer.parseInt(input.nextLine());
            input.close();
            return j;
        } catch (Exception e) {
            System.out.println("Please enter a valid number from list.");
            return -1;
        }
    }

 
    public static void setEG5050(){
        coolant eg5050 = new coolant();
        eg5050.name = "Ethylene Glycole - Water Mixture (50-50)";
        eg5050.setLimits(235.15,398.15,0.5,2);
        eg5050.setDensityMap(298,1,1071.11,-0.459749,-0.002432, 0.00016481,0.0385,0,0);
        eg5050.setEnthalpyMap(298,1,0,3300,1.9308,0);
        
    }
}
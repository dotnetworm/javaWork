import java.io.IOException;
import java.util.Scanner;
class createProducts {
	public static void main(String[] args) throws IOException, InterruptedException {
	greetings newGreet = new greetings();
	newGreet.greet();
	greetings newStart = new greetings();
	newStart.start();
	Product Listing = new Product();
	String productName = "";;
	int quantity = 0;
	String productURL = "";
	double productPrice = 0;
    
   
    while (true) { // Condition in while loop is always true here
		Scanner input = new Scanner(System.in);
		System.out.println("Product Name");
		productName = input.nextLine();
		input.close();
		if (productName == "") {
			break;
		}
		

      System.out.println("You entered " + productName);
		///while(flag){
			///System.out.println("Product Name: ");
			///Scanner temp = new Scanner(System.in);
			///flag = false;
			
		///}
		///System.out.println("Outside");
		}
	}
}
	
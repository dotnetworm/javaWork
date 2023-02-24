class Product {
	private String name;
	private double price;
	private int quantity;
	private String URL;
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public String getURL(){
		return URL;
	}
	
	public String setName(String newProductName){
		if(newProductName==null){
			name = "Unknown Product";
		} else {
			name = newProductName;
		}
		return name;
	}
	
	public double setPrice(double newProductPrice){
		if(newProductPrice==0){
			price = -1;
		} else {
			price = newProductPrice;
		}
		return price;
	}
	
	public int setQuantity(int newProductQuantity){
		if(newProductQuantity==0){
			quantity = -1;
		} else {
			quantity = newProductQuantity;
		}
		return quantity;
	}
	
	public String setURL(String newProductURL){
		if(newProductURL==null){
			URL = "Unknown URL";
		} else {
			URL = newProductURL;
		}
		return URL;
	}
	
	public void listProduct(Product[] obj){
		
		if(obj.length <= 0){
			System.out.println("No Product exist.");
		} else {
			int j = 0;
			while(j < obj.length){
				System.out.println("The quantity of the product "+obj[j].getName()+" is "+obj[j].getQuantity());
				j=j+1;
			}
		}
	}
}
	
import java.io.*;

class greetings {
	public void greet() throws IOException, InterruptedException {
		
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("################################################################");
			System.out.println("##                 WELCOME TO PRODUCT                         ##");
			System.out.println("##                  CREATION SOFTWARE                         ##");
			System.out.println("##                                                            ##");
			System.out.println("################################################################");
			System.out.println("##                  written by E. SOYLU                       ##");
			System.out.println("################################################################");
			Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(java.lang.InterruptedException iex) {
			System.out.println(iex);
		}
	}
	
	public void start() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("################################################################");
		System.out.println("#####               PLEASE FILL REQUIRED SPACES             ####");
		System.out.println("################################################################");
	}

}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class PCSetup{
			String name; 
		    String Cpu;
			String Keyboard;
			String Gpu;
			String Mouse;
			String Motherboard;
			String HardDrive;
			String RAM;
			String Monitor;
		}
		PCSetup PC1 = new PCSetup();
		PC1.name = "1080 Ti Beast.";  
	    PC1.Cpu = "7700k.";
		PC1.Keyboard = "Corsair K55 RGB Keyboard."; 
		PC1.Gpu = "2 EVGA Geforce GTX 1080 Ti.";
		PC1.Mouse = "Asus Cerberus Gaming Mouse.";
		PC1.Motherboard = "Asus Rog Strix X99 RGB Motherboard.";
		PC1.HardDrive = "Seagate Barracude 7200 RPM.";
		PC1.RAM = "16 GB Corsair Vengence.";
		PC1.Monitor = "Asus 4k 28 Inch Monitor.";
		
		System.out.println( "My computer name is:  " + PC1.name);
		System.out.println("The computer runs on a " + PC1.Cpu);
		System.out.println("My keyboard is a " + PC1.Keyboard);
		System.out.println("I have " + PC1.Gpu);
		System.out.println("I use an " + PC1.Mouse);
		System.out.println("For the core of it all, I have an " + PC1.Motherboard);
		System.out.println("My hard drive is a " + PC1.HardDrive);
		System.out.println("I went with " + PC1.RAM);
		System.out.println("Last but not least, I use an " + PC1.Monitor);
		}

	}



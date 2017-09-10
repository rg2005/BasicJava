
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Car{
		    void start(){
		        System.out.println("starting the car");
		    }

		    void stop(){
		        System.out.println("stopping the car");
		    }
		}

		// accessing methods
		Car c1 = new Car();
		c1.start();
		c1.stop();

	}

}

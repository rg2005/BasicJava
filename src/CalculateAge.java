
public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 65;
		
		if(age < 13) {
			System.out.println("You are a kid.");
		}
		else if(age >=13 && age <=19 ) {
			System.out.println("You are a teenager.");
		}
		else if (age >=20 && age <=60 ) {
			System.out.println("You are an adult.");
		}
		if(age > 60) {
			System.out.println("You are a senior!");
		}
		
		}
	}



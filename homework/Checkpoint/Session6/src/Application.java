
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake1 = new Cake();
		cake1.personname = "Krishna";
		cake1.amountOfCream = 289;
		cake1.sprinkles = 39;
		cake1.candles = 56;
		cake1.layers = 4;
		
		System.out.println(cake1.personname + " "
				+ "is the written on the cake.");
		System.out.println("The amount of cream in ounces is " + cake1.amountOfCream);
		System.out.println("The number of sprinkles is " + cake1.sprinkles);
		System.out.println("The number of candles is " + cake1.candles);
		System.out.println("The number of cake layers is " + cake1.layers);
		
	}

}

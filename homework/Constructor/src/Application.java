class Person {

	String name;
	String age;


	Person(String inputage) {
		age = "12";
	}
	


	void printName() {
		System.out.println("My name is Rohit");
	}

	void printAge() {
		System.out.println("My age is " + age);
	}
}

class Application {
	public static void main(String[] args) {
		Person p1 = new Person("Rohit");
		p1.printName();
		p1.printAge();
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 19 ;
		if(grade < 5) {
			System.out.println("Elementary School");
		}else if(grade >=6 && grade <=8){
			System.out.println("Middle School");
		}else if(grade >=9 && grade <=12){
			System.out.println("High School");
		}else if(grade > 12){
			System.out.println("College");
		}
	}

}
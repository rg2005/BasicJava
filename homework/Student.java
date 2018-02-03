
public class Student {
	String readBook;
	int numberOfMinutes;
	int numberOfHoursPlayed;
	void dohomework() {

	}
	void readBook(String readBook) {
		
	}
	void readBook(String readBook, int numberofMinutes) {
		
	}
	int getNumberOfHoursPlayed() {
		
		return numberOfHoursPlayed;
	}
	int play(String gamename, int numberOfMinutesPlayed) {
	
		if(numberOfMinutesPlayed >= 120)
			System.out.println("You won!");
		else if(numberOfMinutesPlayed <= 120)
			System.out.println("You lost!");
		
		return numberOfMinutesPlayed;

	}
}

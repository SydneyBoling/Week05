package CodingAssignment;

public class AsteriskLogger implements Logger {

	public void Log(String word) {
		System.out.println("*** " + word + " ***");
	}

	public void Error(String word2) {
			System.out.println( "******************** " + "\n" +  "***ERROR: " + word2 + "***" + "\n" + "********************");
		}
	}
	


package CodingAssignment;

public class SpacedLogger implements Logger {

	public void Log(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i) + " ");
		}
	}
	
	
	public void Error(String word2) {
		System.out.println(" ");
		for (int i = 0; i < word2.length(); i++) {
			System.out.print( word2.charAt(i) + " ");
		}
	}

}

package CodingAssignment;

public class App {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("");

		Logger word = new AsteriskLogger();
		word.Log("Madness");
		word.Error("Goodbye");

		Logger word2 = new SpacedLogger();
		word2.Log("Hockey");
		word2.Error("Java");
	}

}

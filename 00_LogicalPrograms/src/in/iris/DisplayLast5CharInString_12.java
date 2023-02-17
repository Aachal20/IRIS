package in.iris;

public class DisplayLast5CharInString_12 {

	static String  findLastCharInString() {
		String word = "Hello Welcome to IRIS";
		System.out.println("Original String::"  +word);
		if (word.length() > 5) {
			int length = word.length();
			int ll= length-5;
			System.out.println("The substring is: " +word.substring(length,21));
			return word.substring(word.length() - 3);
		} else {
			// whatever is appropriate in this case
			throw new IllegalArgumentException("word has fewer than 3 characters!");
		}

	}
	public static void main(String[] args) {
		DisplayLast5CharInString_12.findLastCharInString();

	}
}

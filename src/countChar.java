
public class countChar {

	public static void main(String[] args) {
		String input = "neveen";
		countCharacters(input);

	}

	public static void countCharacters(String input) {
		// Convert the input string to lowercase for case-insensitive counting
		input = input.toLowerCase();

		// Array to store the count of each character (assuming ASCII characters)
		int[] charCounts = new int[256];

		// Iterate through each character in the input string
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			// Increment the count of the current character
			charCounts[currentChar]++;
		}

		// Print the character counts
		for (int i = 0; i < charCounts.length; i++) {
			if (charCounts[i] > 0) {
				System.out.println((char) i + ": " + charCounts[i]);
			}
		}
	}

}

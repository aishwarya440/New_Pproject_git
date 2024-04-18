import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class class1 {

	public static void main(String[] args) {
		String s = "Selenium Testing";

		// Method 1 : using StringBuffer class which is mutable and has reverse method

		StringBuffer sf = new StringBuffer(s);

		System.out.println(sf.reverse());

		// Method 1 : using StringBuffer class which is mutable and has reverse method

		StringBuffer sf1 = new StringBuffer(sf);

		System.out.println(sf1.reverse());

		// Method 2 : using for loop and chatAt existing methods

		int length = s.length();
		String reversed_string = "";

		for (int i = length - 1; i >= 0; i--) {
			reversed_string = reversed_string + s.charAt(i);
		}

		System.out.println(reversed_string);

		// Method 2 : using for loop and chatAt existing methods
		int length1 = reversed_string.length();
		String expected_string = "";

		for (int i = 0; i <= length1 - 1; i++) {
			expected_string = expected_string + s.charAt(i);
		}

		System.out.println(expected_string);

		String input = "Aishwarya Soni";
		List<String> words = Arrays.asList(input.split(" "));
		Collections.reverse(words);
		String result = "";
		for (String word : words) {
			if (!result.isEmpty()) {
				result += " ";
			}
			result += word;
		}
		System.out.println(result);//New comment for new commit

	}

}

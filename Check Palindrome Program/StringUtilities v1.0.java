package Demo;

public class StringUtilities {

	// Function checks the string for palindrome;
	// Input parameter : [Object] - inputText - String to check palindrome
	// Output parameter : return [Boolean] - true or false based on inputText

	public static boolean checkPalindrome(Object inputTextObject) {

		// input is object and it covert into String
		String inputString = inputTextObject.toString();
		// String is changed into lower case
		inputString = inputString.toLowerCase();
		// Creating new SttingBuffer lowercase
		StringBuffer inputstringBuffer = new StringBuffer(inputString);
		// Reverse Input Text String buffer object
		StringBuffer inputStringbufferreverse = inputstringBuffer.reverse();
		String OutputStringbufferreverse = inputStringbufferreverse.toString();
		// Returing the boolean value
		return inputString.equals(OutputStringbufferreverse);

	}

}

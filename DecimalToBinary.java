package numberProcessors;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		final String SUBSCRIPT_TWO = "\u2082";
		final String SUBSCRIPT_TEN = "\u2081".concat("\u2080");
		Scanner numGrabber = new Scanner(System.in);
		System.out.println("Please enter a base" + SUBSCRIPT_TEN + " number to convert to base" + SUBSCRIPT_TWO);
		String userInput = numGrabber.next();
		while (!(userInput.equals("Close"))) {
			int decimalNum = Integer.parseInt(userInput);
			String tempBinaryNum = "";
			String finalBinaryNum = "";
			while (decimalNum != 0) {
				int remainderNum = decimalNum % 2;
				tempBinaryNum = tempBinaryNum.concat(String.valueOf(remainderNum));
				decimalNum = decimalNum/2;
			}
			for (int i = tempBinaryNum.length() - 1; i >= 0; i--) {
				finalBinaryNum = finalBinaryNum.concat(tempBinaryNum.substring(i, i + 1));
			}
			System.out.println(finalBinaryNum);
			System.out.println("Please input the next Base" + SUBSCRIPT_TEN + " number." + " Or Enter \"Close\" to return to the main program");
			userInput = numGrabber.next();
		}
		NumberProcessor.main(null);
	}

}

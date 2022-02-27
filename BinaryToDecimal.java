package numberProcessors;
import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		final String SUBSCRIPT_TWO = "\u2082";
		final String SUBSCRIPT_TEN = "\u2081".concat("\u2080");
		int decimalNum = 0;
		Scanner binaryInput = new Scanner(System.in);
		System.out.println("Please enter a base" + SUBSCRIPT_TWO + " number to convert to base" + SUBSCRIPT_TEN);
		String binaryNum = binaryInput.next();
		while (!(binaryNum.equals("Close"))) {
			for (int i = 0; i < binaryNum.length(); i++) {
				decimalNum += Integer.valueOf(binaryNum.substring(i, i+1)) * Math.pow(2, binaryNum.length() - (1 + i));
			}
			System.out.println(decimalNum);
			System.out.println("Please input the next Base" + SUBSCRIPT_TWO + " number." + " Or Enter \"Close\" to return to the main program");
			binaryNum = binaryInput.next();
		}
		NumberProcessor.main(null);
	}
}
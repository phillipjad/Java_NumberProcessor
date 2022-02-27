package numberProcessors;
import java.util.Scanner;

public class BinaryToHexadecimal {

	public static void main(String[] args) {
		final String SUBSCRIPT_TWO = "\u2082";
		final String SUBSCRIPT_SIXTEEN = "\u2081".concat("\u2086");
		Scanner binaryInput = new Scanner(System.in);
		System.out.println("Please enter a base" + SUBSCRIPT_TWO + " number to be converted to base" + SUBSCRIPT_SIXTEEN);
		String binaryNum = binaryInput.next();
		while (!(binaryNum.equals("Close"))) {
			String hexadecimalNum = "";
			int decimalNum = 0;
			final String[] hexadecimalValues = {"0", "1", "2", "3",
												"4", "5", "6", "7",					
				                                "8", "9", "A", "B",
				                                "C", "D", "E", "F",};
			if (binaryNum.length() % 4 == 0) {
				for (int i = 0; i < (binaryNum.length()/4); i++) {
					for (int j = 0; j < 4; j++) {
						decimalNum += Integer.valueOf(binaryNum.substring(((i * 4) + j), ((i * 4) + j + 1))) * Math.pow(2, (3-j));
					}
					hexadecimalNum = hexadecimalNum.concat(hexadecimalValues[decimalNum]);
					decimalNum = 0;
				}
			}
			else {
				while (binaryNum.length() % 4 != 0) {
					binaryNum = "0" + binaryNum;
				}
				for (int i = 0; i < (binaryNum.length()/4); i++) {
					for (int j = 0; j < 4; j++) {
						decimalNum += Integer.valueOf(binaryNum.substring(((i * 4) + j), ((i * 4) + j + 1))) * Math.pow(2, 3-j);
					}
					hexadecimalNum = hexadecimalNum.concat(hexadecimalValues[decimalNum]);
					decimalNum = 0;
				}
			}
			System.out.println(hexadecimalNum);
			System.out.println("Please input the next Base" + SUBSCRIPT_TWO + " number." + " Or Enter \"Close\" to return to the main program");
			binaryNum = binaryInput.next();
			continue;
		}
		NumberProcessor.main(null);
	}
}

package numberProcessors;
import java.util.Scanner;

public class NumberProcessor {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String userChoice;
		final Object[][] keywordTable = new String[4][];
		keywordTable[0] = new String[] {"Binary to Decimal", "=", "BD"};
		keywordTable[1] = new String[] {"Binary to Hexadecimal", "=", "BHD"};
		keywordTable[2] = new String[] {"Decimal to Binary", "=", "DB"};
		keywordTable[3] = new String[] {"To close the processor", "=", "Close"};
		System.out.println("Welcome to the best number processor ever created in Java");
		System.out.println("View the table below and enter the corresponding keyword");
		System.out.format("%15s%15s%15s%n", keywordTable[0]);
		System.out.format("%15s%11s%16s%n", keywordTable[1]);
		System.out.format("%15s%15s%15s%n", keywordTable[2]);
		System.out.format("%15s%10s%18s%n", keywordTable[3]);
		userChoice = userInput.next();
		if (userChoice.equals("BD")) {
			BinaryToDecimal.main(null);
		}
		else if(userChoice.equals("BHD")) {
			BinaryToHexadecimal.main(null);
		}
		else if(userChoice.equals("DB")) {
			DecimalToBinary.main(null);
		}
		else if(userChoice.equals("Close")) {
			userInput.close();
			System.out.println("Thank you, goodbye!");
		} 
		else {
			System.out.println("Incorrect keyword entered.  Restarting number processor");
			NumberProcessor.main(null);
		}
			
	}

}

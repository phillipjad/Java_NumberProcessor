package numberProcessors;

public class DecimalToBinary {
	
	public static String base10tobase2(int num) {
		//String to be returned by method
		String returnString = "";
		//This while loop will run until all bits of the base10 int have been turned into a base2 string representation
		while (num != 0) {
			String prefix;
			prefix = ((num & 1) == 1) ? "1" : "0";
			returnString = prefix.concat(returnString);
			num >>= 1;
		}
		return returnString;
	}
	
	/*testing
	public static void main(String args[]) {
		// 10
		System.out.println(base10tobase2(2));
		// 1
		System.out.println(base10tobase2(1));
		//1000
		System.out.println(base10tobase2(8));
		//11001
		System.out.println(base10tobase2(25));
		//1111
		System.out.println(base10tobase2(15));
	} */
}

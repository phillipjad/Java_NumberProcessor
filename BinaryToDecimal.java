package numberProcessors;

public class BinaryToDecimal {
	public static String base2tobase10(String binaryString){
		int decimalNum = 0;
		String returnString;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				decimalNum += Math.pow(2, binaryString.length()-(i+1));
			}
		}		
		returnString = String.valueOf(decimalNum);
		return returnString;
	}
	
	/*testing
	public static void main(String[] args) {
		//125
		System.out.println(base2tobase10("1111101"));
		//8
		System.out.println(base2tobase10("1000"));
		//15
		System.out.println(base2tobase10("1111"));
		//128
		System.out.println(base2tobase10("10000000"));
		//170
		System.out.println(base2tobase10("10101010"));
	}
	*/
}
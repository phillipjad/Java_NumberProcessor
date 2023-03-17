package numberProcessors;

public class BinaryToHexadecimal {

	public static String base2tobase16(String base2Num) {
		final char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String returnString = "";
		int iter = 1;
		while (base2Num.length() % 4 != 0) {
			base2Num = "0".concat(base2Num);
		}
		while(returnString.length() != (base2Num.length()/4)) {
			returnString = String.valueOf(hexDigits[Integer.parseInt(BinaryToDecimal.base2tobase10(base2Num.substring(((iter-1) * 4), (((iter-1) * 4) + 4))))]).concat(returnString);
			iter++;
		}

		return returnString;
	}
	
	/*Testing
	public static void main(String[] args) {
		//F
		System.out.println(base2tobase16("1111"));
		//FF
		System.out.println(base2tobase16("11111111"));
		//1
		System.out.println(base2tobase16("1"));
		//2
		System.out.println(base2tobase16("10"));
		//A
		System.out.println(base2tobase16("1010"));
		//B
		System.out.println(base2tobase16("1011"));
		//E
		System.out.println(base2tobase16("1110"));
	}*/
}

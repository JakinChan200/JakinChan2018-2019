
public class HourGlass {

	public static void main(String[] args) {
		System.out.println("|" + printChars("*", 10) + "|");
		for(int j = 4; j > 0; j--) {
			printChars(" ", 5-j);
			System.out.print("\\");
			printChars("::", j);
			System.out.println("/");
		} 
	}
	
	public static String printChars(String character, int numPrints) {
		String line = "";
		for(int i = 0; i < numPrints; i++) {
			line += character;
		}
		return line;
	}	
}

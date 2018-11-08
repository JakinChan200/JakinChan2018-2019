
public class HourGlass {

	public static void main(String[] args) {
		String topAndBottom = ("|" + printChars("*", 10) + "|\n");
		String top = topCurve();
		String middle = "     ||\n";
		String bottom = bottomCurve();
		System.out.println(topAndBottom + top + middle + bottom + topAndBottom);
	}
	
	public static String topCurve() {
		String curve = "";
		for(int j = 4; j > 0; j--) {
			curve += printChars(" ", 5-j) + "\\" + printChars("::", j) + "/\n";
		} 
		return curve;
	}
	
	public static String bottomCurve() {
		String curve = "";
		for(int j = 0; j < 4; j++) {
			curve += printChars(" ", 4-j) + "/" + printChars("::", j+1) + "\\\n";
		} 
		return curve;
	}
	public static String printChars(String character, int numPrints) {
		String line = "";
		for(int i = 0; i < numPrints; i++) {
			line += character;
		}
		return line;
	}	
}

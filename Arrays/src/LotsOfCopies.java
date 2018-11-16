/*This code is primarily for testing the properties of ints, Strings, and arrays
 * 
 * @author Jakin Chan
 * @version 9 November 2018
 */
import java.util.Arrays;
public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		part2WithInts();
		part2WithStrings();
		part2WithArrays();
	}
	public static void changeMe(int x, String str, int[] arr) {
		x = 229886;
		str += str;
		arr[4] = 100;
	}
	public static void part2WithInts() {
		int a = 7;//a = startValue;
		int b = a;//b = a;
		a = 1;	  //a = newValue;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithStrings() {
		String a = "Hi";//a = startValue;
		String b = a;//b = a;
		a = "Bye";	  //a = newValue;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	public static void part2WithArrays() {
		int[] a = {1, 2, 3};//a = startValue;
		int[] b = a;//b = a;
		a[0] = 0;
		a[1] = 1;
		a[2] = 2; //a = newValue;
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("b: " + Arrays.toString(b));
	}
}

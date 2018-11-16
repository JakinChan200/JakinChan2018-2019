/*This Minilab showcases the different ways to utilize and manipulate Arrays
 * 
 * @author Jakin Chan
 * @version 15 November 2018
 */
import java.util.Arrays;
import java.util.Scanner;

public class MiniLab {
	public static void main(String[] args) {
		System.out.println("Problem 1:");
		/* Problem 1:
		 * Declare a new integer array called arr1.  
		 * It should start empty but have space to store 10 elements.   
		 * Use a for loop to fill it with consecutive numbers starting with 2016.
		 */
		int[] arr1 = new int[10];
		int counter = 2016;
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = counter;
			counter++;
		}
		
		String forPrinting = Arrays.toString(arr1);       
		System.out.println(forPrinting);
		
		System.out.println("\n\nProblem 2:");
		/* Problem 2:
		 * The following code has errors.  It is supposed to print the schedule for this unit.
		 * Remove the comments, run it, then find and fix the error.
		 */
		
		
		String[] schedule = {"Sec 7.1 and .split()", "for vs. for-each loops", "Sec 7.2", "Sec 7.4",
				"Lab Day", "Sec 7.3", "Review", "Test"};
		int numDays = schedule.length;
		for (int i = 0; i < numDays; i++)
		{
			System.out.println("Day " + i + ": " + schedule[i]);
		}
		
		System.out.println("\n\nProblem 3:");		
		/* Problem 3:
		 * Write code to collect information about the cost of each meal ordered in a dinner
		 * out with friends.  To start you off, code is provided that asks for the number of 
		 * meals.  Use this value to create an empty array of doubles called mealPrices that 
		 * will store the cost of each meal.  Prompt the user to enter the cost of each meal.  
		 * (Ex.  "Price of meal 1: ")  
		 * The code to print your array is given below, you just need to uncomment it. 
		 */
		Scanner console = new Scanner(System.in);
		System.out.print("How many meals did you buy?");
		int numMeals = console.nextInt(); 
		double[] mealPrices = new double[numMeals];
		
		for(int i = 0; i < mealPrices.length; i++){
			System.out.print("Price of Meal " + (i+1) + ": ");
			mealPrices[i] = console.nextDouble();
		} 
		
		System.out.println( Arrays.toString(mealPrices) );
		//console.close();
		
		System.out.println("\n\nProblem 4:");		
		/* Problem 4:
		 * Use the mealPrices array from the previous problem.  Count how many meals cost 
		 * more than $8.  Print your result.  
		 * (Ex. "There were ___ meals over $8 out of ___ total")
		 */
		
		int mealsOverEight = 0;
		for(int i = 0; i < mealPrices.length; i++){
			if(mealPrices[i] > 8){
				mealsOverEight++;
			}
		}
		System.out.println("There were " + mealsOverEight + " meals over $8 out of " + mealPrices.length + " total.");
		
		System.out.println("\n\nProblem 5:");
		/* Problem 5:
		 * Use the mealPrices array from the previous problem.  Find the most expensive meal
		 * in the array and print its cost.  (Ex.  "The most expensive meal was $_____!")		
		 */
		
		double mostExpensive = 0;
		for(double element : mealPrices){
			 if(element >= mostExpensive){
				mostExpensive = element;
			 }
		}
		System.out.println("The most expensive meal was $" + mostExpensive + "!");
		
		System.out.println("\n\nProblem 6:");		
		/* Problem 6:  
		 * Remember the Calculate project and how dumb the average method was because you had to
		 * tailor the method to 2 numbers or 3 numbers?  Write a method here that accepts an array, 
		 * computes the average of its values, and returns that average.    
		 * Test it out by calling it below, and passing it your mealPrices.  
		 * Print your result: "The average cost of a meal was $_____"  
		 */
		
		System.out.println("The average cost of a meal was $" + averageMealPrice(mealPrices));
		
		
		System.out.println("\n\nProblem 7:");		
		/* Problem 7: 
		 * Create a string array containing the last names of all your teachers this year
		 * Print the array.  
		 * Then create a scanner and ask the user to enter the last name of a teacher.
		 * If that teacher is in the array, print "Yay, I have ______ too!" otherwise say
		 * "I don't have _____"    
		 */
		
		String[] myTeachers = {"Gregoric", "Nichols", "Dreyer", "Peel", "Leung", "Dove"};
		System.out.println("My teachers are: " + Arrays.toString(myTeachers));
		System.out.print("Who is your teacher?");
		String teacherOfUser = console.next();
		boolean sameTeacher = false;
		for(String teacher : myTeachers){
			if(teacher.equals(teacherOfUser)){
				sameTeacher = true;
			}
		}
		
		if(sameTeacher){
			System.out.println("Yay, I have " + teacherOfUser + " too!");
		}else{
			System.out.println("I don't have " + teacherOfUser);
		}
		
		System.out.println("\n\nProblem 8:");		
		/* Problem 8:
		 * Use a Scanner to ask a user for their list of teachers and put them in an array.
		 * Write a method teacherCompare that accepts two String arrays (mine and yours).  If they  
		 * are the same, it prints "We have the same teachers!" otherwise it says "Aw, we have 
		 * different classes".  There is no return.  
		 * Hint: Useful methods built into the prewritten (and already imported) Arrays class can be 
		 * found on p461 of your textbook.   
		 */
		System.out.print("How many teachers do you have? ");
		String[] yourTeachers = new String[console.nextInt()];
		for(int i = 0; i < yourTeachers.length; i++){
			System.out.print("Type in the name of one teacher: ");
			yourTeachers[i] = console.next();
		}
		teacherCompare(myTeachers, yourTeachers);
		console.close();
	}
	
	public static double averageMealPrice(double[] mealPrices){
		double sum = 0;
		for(double price : mealPrices){
			sum += price;
		}
		return sum / mealPrices.length;
	}
	
	public static void teacherCompare(String[] myTeachers, String[] yourTeachers){
		if(Arrays.equals(myTeachers, yourTeachers)){
			System.out.println("We have the same teachers!");
		}else{
			System.out.println("Aw, we have different classes");
		}
	}
}

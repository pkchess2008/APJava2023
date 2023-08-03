package Session02;
/**
* Category 2: Methods that take input as a parameter but does not return
*/
import java.util.Scanner;	
public class Program0201 {
	
	public static void findSum (int a, int b) {
		int sum;
		
		sum = a + b;
		
		System.out.println("The sum of " + a + " and " + b + " is = " + sum);
	}
	
	public static void findDifference (int a, int b) {
		int difference;
		
		difference = a - b;
		
		System.out.println("The difference of " + a + " and " + b + " is = " + difference);
	}

	public static void main(String[] args) {
		Scanner bot = new Scanner (System.in);
		
		//Input 
		int x, y;
		
		System.out.println("Enter first number:");
		x = bot.nextInt();
		System.out.println("Enter second number:");
		y = bot.nextInt();
		
		findSum (x, y);
		findDifference(x, y);

	}

}

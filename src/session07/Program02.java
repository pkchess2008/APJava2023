package session07;


/**
 * Program to prompt and accept the computer marks of n students of a class.
 * Find the highest marks.
 * 
 */
import java.util.Scanner;
public class Program02 {

	public static void main(String[] args) {
		
		//declaration
		Scanner bot = new Scanner(System.in);
		int n;
		double[] marks;
		double highestMarks;
		
		//Input
		System.out.println("Enter the number of students in the class: ");
		n = bot.nextInt();
		
		//Static initialization
		marks = new double[n];
		
		//Input
		for (int i = 0; i <n;i++) {
			System.out.println("What is the mark of student " + (i+1) + ": ");
			marks[i] = bot.nextDouble();
		}
		
		//Computation
		highestMarks = marks[0];
		
		for (int i = 1; i < n; i++) 
		{
		    if (marks[i] > highestMarks)
			{
				highestMarks = marks[i];
				
			}
		}
		
		//Output 
		
		
		

	}

}

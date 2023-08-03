package session07;

/**
 *  Write a program to prompt and accept marks 
 *  of n subjects of a student and 
 *  find the total and average marks. 
 *  Display the marks, total marks and average marks.
 */
import java.util.Scanner;
public class Program01 {

	public static void main(String[] args) {
		
		//Declaration
		Scanner bot = new Scanner (System.in);
		int n;
		double[] marks;
		double sum;
		double average ;
		
		//Input
		System.out.println("Enter the number of subjects : "); 
		n = bot.nextInt();
		
		//Create an array
		marks = new double[n];
		 
		for(int i = 0; i < marks.length; i++)  
		{  
			System.out.println("Enter the mark of the subject " + (i+1) + ": "); 
			marks[i] = bot.nextInt();  
		} 
		
		//Computation
		sum = 0;
		for(int i = 0; i <marks.length;i++)
		{
			sum = sum +marks[i];
		}
		
		//Calculate computation
		average = (double)sum/marks.length;
		
		
		//Output
		
		for(int i = 0; i < marks.length; i++)  
		{  
			System.out.println("The mark of the subject " + (i+1) + ": " +
				marks[i]	); 
		} 
		
		System.out.println("The total marks of the student is " + 
				sum + " and the average is " + average);
	}
}

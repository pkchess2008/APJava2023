package session06Homework;

/**
 *  Write a program to prompt and accept marks 
 *  of 6 subjects of a student and find the 
 *  total marks and average marks. Display 
 *  the marks, total marks and average marks.
 */
import java.util.Scanner;
public class Program01 {

	public static void main(String[] args) {
		
		//Declaration
		Scanner bot = new Scanner (System.in);
		int [] marks = new int[6];
		double sum;
		double average ;
		
		//Input
		System.out.println("Enter the marks of the students: ");  
		for(int i = 0; i < marks.length; i++)  
		{  
			marks[i] = bot.nextInt();  
		} 
		
		//Computation
		sum = 0;
		for(int i = 0; i <marks.length;i++)
		{
			sum = sum +marks[i];
		}
		
		//you can type cast before sum below (double)
		average = (double)sum/marks.length;
		
		//Output
		System.out.println("The total marks of the student is " + 
				sum + " and their average is " + average);
	}
}

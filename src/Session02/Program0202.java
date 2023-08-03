package Session02;
/**
 * Write a program to implement the following methods 
	void findAreaOfCircle(double radius)
	void findVolumeOfSphere(double radius) 
	*/
import java.util.Scanner;	
public class Program0202 {

	public static void calculateAreaOfCircle(double radius) {
		double area;
		
		area = Math.PI * radius * radius;
		
		System.out.println("The area of circle with area of " + radius + " is = " + area);
	}
	public static void calculateVolumeOfSphere( double radius) {
		double area;
		
		area = Math.PI * (4.0/3.0) * radius * radius;
		
		System.out.println("The volume of a sphere with radius of " + radius + " = " + area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bot = new Scanner (System.in);
		double x;
		
		System.out.println("What is the length of radius");
		x = bot.nextInt();
		
		calculateAreaOfCircle(x);
		calculateVolumeOfSphere(x);
		
		

	}

}

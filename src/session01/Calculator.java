package session01;

import java.util.Scanner;
public class Calculator {
	
	public static void calculateAreaOfSquare() {
		
		//Declaration
		Scanner bot = new Scanner (System.in);
		double side;
		double area;
		
		//Input
		System.out.println("Enter your Length : ");
        side = bot.nextInt();        
        
		
		//Computation
        area = side  * side ; 
		
		//Output
         System.out.println("The Area of a square with length of " 
        		 + side + " is " + area);
        
	}
	
	
	public static void calculateAreaOfRectangle() {
		
		//Declaration
		Scanner bot = new Scanner (System.in);
		double length;
		double width;
		double area;
		
		//Input
		System.out.println("What is the length");
		length = bot.nextInt();
		System.out.println("What is the width");
		width = bot.nextInt();
		
		//Computation
		area = width * length;
		
		//Output
		System.out.println("The area of a rectangle with side length is " +
		length + " "  + width + " is =" + area );
		
		
	}

	public static void calculateAreaOfTriangle() {
		
		//Declaration
		Scanner bot = new Scanner (System.in);
		double base, height, area;
		
		//Input 
		System.out.println("Enter your base length ");
		base = bot.nextInt();
		System.out.println("Enter your height");
		height = bot.nextInt();
		
		
		//Computation
		area = (base * height)/2;
		
		//Output 
		System.out.println("The area of a triangle with base of " + 
				base + " and height of " + height + " is " + area);
		
	}
	
	public static void calculateAreaOfCircle() {
		//Declaration
		Scanner bot = new Scanner (System.in);
		double radius, area;
		
		//Input
		System.out.println("Enter your radius ");
	    radius = bot.nextInt();
	    
	    
	    //Computation
	    area = Math.PI*radius*radius;
	 
	    //Output
	    System.out.println("The area of a circle with the radius of " + 
	    radius  + " is " + area);	
	    

	}

	public static void main(String[] args) {
		
		//Declaration
        Scanner bot = new Scanner (System.in);
        int choice;
        
        //Static Initialization
        choice = -1;
        
        //Loop to handle area calculator
        while(choice != 0) {
	        //Step 1 - Display the Menu
	        System.out.println("----------------------------------------");
	        System.out.println("      A R E A   C A L C U L A T O R     ");
	        System.out.println("----------------------------------------");
	        System.out.println("             1. Area of Square          ");
	        System.out.println("             2. Area of Rectangle       ");
	        System.out.println("             3. Area of Triangle        ");
	        System.out.println("             4. Area of Circle          ");
	        System.out.println("----------------------------------------");
	        
	        //Step 2 - Prompt you and accept the user's choice
	        System.out.println("             Pick a function            ");
	        choice = bot.nextInt();
	        bot.nextLine(); //Flush the enter key if exists
	       
	        System.out.println("----------------------------------------");
	        
	        //Step 3 - Process the choice
	        switch(choice)
	        {
	            case 1:
	            calculateAreaOfSquare();
	            break;
	            
	            case 2:
	            calculateAreaOfRectangle();
	            break;
	            
	            case 3:
	            calculateAreaOfTriangle();
	            break;
	            
	            case 4:
	            calculateAreaOfCircle();
	        }
        }
        
       
        
        //Step 4 - Good Bye
        System.out.println("----------------------------------------");
        System.out.println("           T H A N K  Y O U             ");
        System.out.println("----------------------------------------");

	}

}

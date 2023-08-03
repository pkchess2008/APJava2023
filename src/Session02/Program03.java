package Session02;
/*
Method to print the following pattern

* * * * *
* * * * *
* * * * *

*/
public class Program03 {
	public static void pattern101() {
		for (int life = 1; life <=3; life ++) {
			for (int age = 1 ; age <=5; age++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	/**
	 * Method to print following pattern 
	 * 1 2 3 4 5 
	 * 1 2 3 4 5 
	 * 1 2 3 4 5 
	 */
	
	public static void pattern102() {
		//loop to print pattern 
		for (int i = 1; i<=3;i++) {
			
			//loop to print ith row 
			for(int j=1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Method to print following pattern 
	1 1 1 1 1 
	2 2 2 2 2 
	3 3 3 3 3 

	 */
	
	public static void pattern103(int rows, int cols) {
		
		//loop to print pattern 
		for (int i = 1; i <= rows; i++) {
			
			//loop to print ith row 
			for(int j=1; j <= cols; j++) {
				System.out.print(i + " ");
			}
			
			//Go to next row
			System.out.println();
		}
	}
	
	
	public static void main (String[] args) {
		pattern103(10, 8);
	}
}

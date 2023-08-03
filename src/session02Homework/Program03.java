package session02Homework;
/*
 * public static void pattern103(int rows, int cols) --- 
	*
	* * 
	* * * 
	* * * *
	* * * * *

 */
public class Program03 {

	public static void pattern103(int rows) {
		for (int i = 1; i <= rows; i++ ) {
			
			for (int j =1; j <= i; j ++) {
				System.out.print("* ");
			
			}
				
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) {
		
		pattern103(5);
		

	}

}

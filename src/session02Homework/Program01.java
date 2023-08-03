package session02Homework;
/**
 *  public static void pattern101( rows,  cols) ---
Method to display the following pattern
* * * * * 
* * * * *
* * * * *

 */


public class Program01 {
	
	public static void pattern101( int rows,  int cols) {
		for (int j = 1; j <= rows; j++ ) {
			
			for (int i =1; i <= cols; i ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}


	public static void main(String[] args) {
		int x, y;
		x = 3;
		y =5;
		pattern101(x,y);
		

	}

}

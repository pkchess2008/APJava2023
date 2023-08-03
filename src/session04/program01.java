package session04;

public class program01 {

	public static void main(String[] args) {
		//pattern101(5);
		//pattern102(5);
		//pattern103(5);
		pattern104(5);

	}
	
/*
 	* 
   *** 
  ***** 
 ******* 
********* 
 ******* 
  ***** 
   *** 
    * 
 */
private static void pattern104(int rows) {
	for (int i = 1; i <= rows; i++) {

		// Spaces
		for (int j = 1; j <= rows - i; j++) {
			System.out.print(" ");
		}

		// Stars
		for (int j = 1; j <= i; j++) {
			System.out.print("*" + "*" );
		}

		System.out.println();
	}
	
	for (int i = rows-1; i >= 1; i--) {

		// Spaces
		for (int j = 1; j <= rows - i; j++) {
			System.out.print(" ");
		}

		// Stars
		for (int j = 1; j <= i; j++) {
			System.out.print("*"+"*");
		}

		System.out.println();
	}
		
	}
/*
 	* 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */
	
	
	private static void pattern103(int rows) {
		for (int i = 1; i <= rows; i++) {

			// Spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* " );
			}

			System.out.println();
		}
		
		for (int i = rows-1; i >= 1; i--) {

			// Spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
		
	/*
	    *
	   **
	  ***
	 ****
	*****
	
	*/
	private static void pattern101(int rows) {

		for (int i = 1; i <= rows; i++) {

			// Spaces
			for (int j = 1; j <= rows - 1; j++) {
				System.out.print(" ");
			}

			// Stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}


	/**
	
	    *
	   **
	  ***
	 ****
	*****
	 ****
	  ***
	   **
	    *
	
	 */
	private static void pattern102(int rows) {
		
		
		for (int i = 1; i <= rows; i++) {

			// Spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int i = rows-1; i >= 1; i--) {

			// Spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	
	/**
	
	
	
	 */
}

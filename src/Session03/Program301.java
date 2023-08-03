package Session03;

public class Program301 {

	/*	
    
    *
	* * 
	* * * 
	* * * *
	* * * * *

	*/
	public static void pattern101( int rows) {
		for (int i = 1; i <= rows; i++ ) {
			
			for (int j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/*
	
	1
	1 2 
	1 2 3
	1 2 3 4
	1 2 3 4 5
	
	
	*/
	
	private static void pattern102(int rows) {
		
		for ( int i = 1; i<=rows; i++) {
			
			for (int j = 1; j<=i; j++) {
				
				System.out.print (j + " ");
			}
			
			System.out.println();
		}
	}
	
	/*
	
	1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5
	
	 */
	private static void pattern103(int rows) {
		
		for ( int i = 1; i<=rows; i++) {
			
			for (int j = 1; j<=i; j++) {
				
				System.out.print (i + " ");
			}
			
			System.out.println();
		}
	}
	
	/**
	 
	 1
	 2 3
	 4 5 6
	 7 8 9 10
	 
	 */
	
	private static void pattern104(int rows) {
		int k = 1;
		for (int i =1; i <=rows; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
		
	}

	
	public static void main(String[] args) {
		//pattern101(5);
		//pattern102(5);
		//pattern103(5);
		//pattern104(4);
		//pattern105(5);
		pattern106(5);
		
	}

	private static void pattern106(int rows) { //loop to print upper half
		
		for(int i = 1; i < rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = rows; i >= 1 ; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	/**
	
	* * * * *
	* * * *
	* * *
	* *
	* 
	
	*/
	private static void pattern105(int rows) {
		
		 for (int i =  rows ; i >=1; i--) {
			 for (int j = 1; j<=i; j++) {
				 System.out.print("* ");
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


	

}

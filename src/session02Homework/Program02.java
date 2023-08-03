package session02Homework;

/*
    public static void pattern102(int rows, cols) ---
	Method to display the following pattern
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
 */


public class Program02 {
	
		public static void pattern102( int rows,  int cols) {
			for (int j = 1; j <= rows; j++ ) {
				
				for (int i =1; i <= cols; i ++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		
		}


		public static void main(String[] args) {
			int x, y;
			x = 3;
			y =5;
			pattern102(x,y);
			

		}

}

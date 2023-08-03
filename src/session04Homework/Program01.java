package session04Homework;

public class Program01 {
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
	public static void main(String[] args) {
		pattern104(5);

	}

}

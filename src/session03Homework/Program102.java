package session03Homework;
/*
 
	1
	2 3
	3 4 5
	4 5 6 7 
	5 6 7 8 9
	4 5 6 7
	3 4 5
	2 3
	1


 */
public class Program102 {

	public static void main(String[] args) {
		
		pattern101(5);
		pattern102(4);
		
	}

	private static void pattern102(int rows) {
			
			for (int i = rows; i >=1; i--) {
				int k = i;
				for(int j = 1 ; j <= i; j++) {
					System.out.print(k + " ");
					k++;
				}
				System.out.println();
			}
	}

	private static void pattern101(int rows) {
		
		for (int i = 1	; i <=rows; i++) {
			int k = i;
			for(int j = 1 ; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
			
			
		}
		
	}

}

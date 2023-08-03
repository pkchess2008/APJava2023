package Session01Homework;

import java.util.Scanner;

public class MiniProject {

	public static void calculateSequentialPrograming() {
		int choice;
		double a, b, c, sum, difference, product, quotient, Area;
		double remainder;
		int luckyNumber;
		int guessedNumber;
		int high;
		int low;
		int day;
		int n;
		double greater, lower;
		int subMenuChoice;
		Scanner bot = new Scanner(System.in);

		subMenuChoice = -1;
		while (subMenuChoice != 0) {
			// Step 1 - Display the Menu
			System.out.println("----------------------------------------");
			System.out.println("S E Q U E N T I A L  C A L C U L A T O R");
			System.out.println("----------------------------------------");
			System.out.println("             1. Addition                ");
			System.out.println("             2. Subtraction             ");
			System.out.println("             3. Multiplication          ");
			System.out.println("             4. Division                ");
			System.out.println("             5. Area of Square          ");
			System.out.println("             6. Area of Rectangle       ");
			System.out.println("             7. Area of Triangle        ");
			System.out.println("             8. Area of Circle          ");
			System.out.println("             9. Volume of Sphere        ");
			System.out.println("             10. Surface area of Sphere ");
			System.out.println("----------------------------------------");
			System.out.println("             0. Exit                    ");
			System.out.println("----------------------------------------");

			// Step 2 - Prompt you and accept the user's choice
			System.out.println("             Pick a function            ");
			subMenuChoice = bot.nextInt();
			System.out.println("----------------------------------------");

			// Step 3 - Process the choice
			switch (subMenuChoice) {
			case 1:
				System.out.println("Enter your first number ");
				a = bot.nextInt();
				System.out.println("Enter your second number ");
				b = bot.nextInt();
				sum = a + b;
				System.out.println("The sum of " + a + " and " + b + " is " + sum);
				break;

			case 2:
				System.out.println("Enter your first number ");
				a = bot.nextInt();
				System.out.println("Enter your second number ");
				b = bot.nextInt();
				difference = a - b;
				System.out.println("The difference of " + a + " and " + b + " is " + difference);
				break;

			case 3:
				System.out.println("Enter your first number ");
				a = bot.nextInt();
				System.out.println("Enter your second number ");
				b = bot.nextInt();
				product = a * b;
				System.out.println("The product of " + a + " and " + b + " is " + product);
				break;

			case 4:
				System.out.println("Enter your first number ");
				a = bot.nextInt();
				System.out.println("Enter your second number ");
				b = bot.nextInt();
				quotient = a / b;
				remainder = a % b;
				System.out.println("The quotient of " + a + " and " + b + " is " + quotient);
				System.out.println("The remainder of " + a + " and " + b + " is " + remainder);
				break;

			case 5:
				System.out.println("Enter your Length ");
				a = bot.nextInt();
				Area = a * a;
				System.out.println("The Area of a square with" + " length of " + a + " is " + Area);
				break;

			case 6:
				System.out.println("Enter your length");
				a = bot.nextInt();
				System.out.println("Enter your width");
				b = bot.nextInt();
				Area = a * b;
				System.out.println(
						"The area of a rectangle with" + " length of " + a + " and width of " + b + " is " + Area);
				break;

			case 7:
				System.out.println("Enter your base length ");
				a = bot.nextInt();
				System.out.println("Enter your height");
				b = bot.nextInt();
				Area = (a * b) / 2;
				System.out.println(
						"The area of a triangle with" + "base length of " + a + " and height of " + b + " is " + Area);
				break;

			case 8:
				System.out.println("Enter your radius ");
				a = bot.nextInt();
				Area = Math.PI * a * a;
				System.out.println("The area of a circle with" + " the radius of " + a + " is " + Area);
				break;

			case 9:
				System.out.println("Enter your radius ");
				a = bot.nextInt();
				Area = (4 / 3) * Math.PI * a * a * a;
				System.out.println("The volume of a sphere with" + " the radius of " + a + " is " + Area);
				break;

			case 10:
				System.out.println("Enter your radius ");
				a = bot.nextInt();
				Area = 4 * Math.PI * a * a;
				System.out.println("The surface area of a sphere" + " with the " + "radius of " + a + " is " + Area);
				break;

			}
		}
	}

	public static void calculateConditionalPrograming() {

		int choice;
		double a, b, c, sum, difference, product, quotient, Area;
		double remainder;
		int luckyNumber;
		int guessedNumber;
		int high;
		int low;
		int day;
		int n;
		double greater, lower;
		int subMenuChoice;

		Scanner bot = new Scanner(System.in);
		subMenuChoice = -1;
		while (subMenuChoice != 0) {
			System.out.println("----------------------------------------");
			System.out.println("|       CONDITIONAL PRGORAMMING         |");
			System.out.println("----------------------------------------");
			System.out.println("  1.Greatest of Two Numbers             ");
			System.out.println("  2.Smallest of Two Numbers             ");
			System.out.println("  3.Greatest of Three Numbers           ");
			System.out.println("  4.Smallest of Three Numbers           ");
			System.out.println("  5.Check if Even or Odd Number         ");
			System.out.println("  6.Check if Positive or Negative Number");
			System.out.println("  7.Guess the Number Game               ");
			System.out.println("  8.Print the day of week (1 to 7)      ");
			System.out.println("  9.Print the month of year (1 to 12)   ");
			System.out.println("  10.Check if year is a leap year       ");
			System.out.println("----------------------------------------");

			System.out.println("             Pick a function            ");
			subMenuChoice = bot.nextInt();
			System.out.println("----------------------------------------");

			switch (subMenuChoice) {
			case 1:
				System.out.println("Enter your first number ");
				a = bot.nextInt();
				System.out.println("Enter your second number ");
				b = bot.nextInt();
				System.out.println("The greatest of " + a + " and " + b + " is =" + Math.max(a, b));
				break;

			case 2:
				System.out.println("Enter your first number ");
				a = bot.nextInt();
				System.out.println("Enter your second number ");
				b = bot.nextInt();
				System.out.println("The smallest of " + a + " and " + b + " is =" + Math.min(a, b));
				break;

			case 3:
				System.out.println("Enter the first number:");
				a = bot.nextInt();
				System.out.println("Enter the second number:");
				b = bot.nextInt();
				System.out.println("Enter the third number:");
				c = bot.nextInt();
				if (a > b) {
					greater = a;
					lower = b;
				} else {
					greater = b;
					lower = a;
				}
				if (greater < c) {
					System.out.println(c + " is greatest");
				} else {
					System.out.println(greater + " is greatest");
				}
				break;

			case 4:
				System.out.println("Enter the first number:");
				a = bot.nextInt();
				System.out.println("Enter the second number:");
				b = bot.nextInt();
				System.out.println("Enter the third number:");
				c = bot.nextInt();
				if (a > b) {
					greater = a;
					lower = b;
				} else {
					greater = b;
					lower = a;
				}
				if (lower < c) {
					System.out.println(lower + " is smallest");
				} else {
					System.out.println(c + " is smallest");
				}
				break;

			case 5:
				System.out.println("Enter your number ");
				a = bot.nextInt();
				if (a % 2 != 0) {
					System.out.println(a + " is a odd number");
				} else {
					System.out.println(a + " is a even number");
				}
				break;

			case 6:
				System.out.println("Enter your number ");
				a = bot.nextInt();
				if (a > 0) {
					System.out.println(a + " is a positive number");
				} else if (a < 0) {
					System.out.println(a + " is a negative number");
				} else {
					System.out.println(a + "is neither odd nor even ");
				}
				break;

			case 7:
				high = 6;
				low = 1;

				luckyNumber = (int) ((Math.random() * (high - low + 1)) + low);

				System.out.println("Guess a nubmer in the range of 1 to 6 : ");
				guessedNumber = bot.nextInt();
				if (luckyNumber == guessedNumber) {
					System.out.println("You win $100,000");

				} else {
					System.out.println(" Better luck next time");
					System.out.println("The number was " + luckyNumber);
				}
				break;

			case 8:
				System.out.println(" what is the date (only day ( 1-7))");
				day = bot.nextInt();
				switch (day) {
				case 1:
					System.out.println(" The day is Sunday");
					break;

				case 2:
					System.out.println(" The day is Monday");
					break;

				case 3:
					System.out.println(" The day is Tuesday");
					break;

				case 4:
					System.out.println(" The day is Wednesday");
					break;

				case 5:
					System.out.println(" The day is Thursday");
					break;

				case 6:
					System.out.println(" The day is Friday");
					break;

				case 7:
					System.out.println(" The day is Saturday");
					break;
				}
				break;

			case 9:
				System.out.println(" what is the month ( 1-12)");
				day = bot.nextInt();
				switch (day) {
				case 1:
					System.out.println(" The day is January");
					break;

				case 2:
					System.out.println(" The day is February");
					break;

				case 3:
					System.out.println(" The day is March");
					break;

				case 4:
					System.out.println(" The day is April");
					break;

				case 5:
					System.out.println(" The day is May");
					break;

				case 6:
					System.out.println(" The day is June");
					break;

				case 7:
					System.out.println(" The day is July");
					break;

				case 8:
					System.out.println(" The day is August");
					break;

				case 9:
					System.out.println(" The day is September");
					break;

				case 10:
					System.out.println(" The day is October");
					break;

				case 11:
					System.out.println(" The day is November");
					break;

				case 12:
					System.out.println(" The day is December");
					break;
				}
				break;

			case 10:
				System.out.println(" what is year ");
				day = bot.nextInt();

				if (day % 100 == 0) {
					System.out.println("This is a not a leap year");
				} else if (day % 4 == 0) {
					System.out.println("This is a leap year");
				} else {
					System.out.println("This is a not a leap year");
				}
				break;

			}
		}
	}

	public static void calculateIteriativePrograming() {
		int choice;
		double a, b, c, sum, difference, product, quotient, Area;
		double remainder;
		int luckyNumber;
		int guessedNumber;
		int high;
		int low;
		int day;
		int n;
		double greater, lower;
		int subMenuChoice;

		Scanner bot = new Scanner(System.in);

		subMenuChoice = -1;
		while (subMenuChoice != 0) {
			System.out.println("----------------------------------------");
			System.out.println("         Iterative Programing           ");
			System.out.println("----------------------------------------");
			System.out.println(" 1. Print numbers from 1 to n            ");
			System.out.println(" 2. Print even numbers from 1 to n       ");
			System.out.println(" 3. Print odd numbers from 1 to n        ");
			System.out.println(" 4. Print numbers from n to 1            ");
			System.out.println(" 5. Print factors of n                   ");
			System.out.println(" 6. Sum of natural numbers from 1 to n   ");
			System.out.println(" 7. Product of natural numbers from 1 to n");
			System.out.println(" 8. Sum of even numbers and product of odd numbers from 1 to n              ");
			System.out.println(" 9. Sum of factors of n                  ");
			System.out.println(" 10. Calculate factorial of n            ");
			System.out.println("----------------------------------------");

			System.out.println("             Pick a function            ");
			subMenuChoice = bot.nextInt();
			System.out.println("----------------------------------------");

			switch (subMenuChoice) {
			case 1:
				System.out.println("Enter value of n here: ");
				n = bot.nextInt();
				for (int counter = 1; counter <= n; counter++) {
					System.out.print(counter + ", ");
				}
				break;

			case 2:
				System.out.println("Enter value of n here: ");
				n = bot.nextInt();
				for (int counter = 1; counter <= n; counter++) {
					if (counter % 2 == 0) {
						System.out.println(counter);
					}
				}
				break;

			case 3:
				System.out.println("Enter value of n here: ");
				n = bot.nextInt();
				for (int counter = 1; counter <= n; counter++) {
					if (counter % 2 != 0) {
						System.out.println(counter);
					}
				}
				break;

			case 4:
				System.out.println("Enter value of n here: ");
				n = bot.nextInt();
				for (int counter = n; counter >= 1; counter--) {
					System.out.print(counter + ", ");
				}
				break;

			case 5:
				System.out.println("Enter the value of n : ");
				n = bot.nextInt();
				System.out.print(" The factors of " + n + " are ");
				for (int i = 1; i <= n; i++) {
					remainder = n % i;
					if (remainder == 0) {
						System.out.print(" " + i + ",");
					}
				}
				break;

			case 6:
				System.out.println("Sum of how many N natural numbers do you want:");
				n = bot.nextInt();
				sum = 0;
				for (int i = 1; i <= n; i++) {
					sum = sum + i;
				}
				System.out.println("The sum of first " + n + " natural numbers is " + sum);
				break;

			case 7:
				System.out.println("Product of how many N natural numbers do you want:");
				n = bot.nextInt();
				sum = 0;
				for (int i = 1; i <= n; i++) {
					sum = sum * i;
				}
				System.out.println("The product of first " + n + " natural numbers is " + sum);
				break;

			case 8:
				System.out.println("Enter value of n here: ");
				n = bot.nextInt();
				sum = 0;
				product = 1;
				for (int counter = 1; counter <= n; counter++) {
					if (counter % 2 == 0) {
						sum = sum + counter;
					} else {
						product = product * counter;
					}
				}

			case 9:
				System.out.println("Enter the value of n : ");
				n = bot.nextInt();
				sum = 0;
				for (int i = 1; i <= n; i++) {
					remainder = n % i;
					if (remainder == 0) {
						sum = sum + i;
					}
				}
				System.out.print(" The sum  factors of " + n + " are " + sum);
				break;

			case 10:
				System.out.println("Enter the value of n : ");
				n = bot.nextInt();
				product = n;
				for (int i = 1; i < n;) {
					product = product * (n - 1);
					n--;
				}
				System.out.println("The factorial of " + n + " is " + product);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// Declaration
		int choice;
		double a, b, c, sum, difference, product, quotient, Area;
		double remainder;
		int luckyNumber;
		int guessedNumber;
		int high;
		int low;
		int day;
		int n;
		double greater, lower;
		int subMenuChoice;

		Scanner bot = new Scanner(System.in);

		choice = -1;
		while (choice != 0) {
			// Step 1 - Display the Menu
			System.out.println("----------------------------------------");
			System.out.println("   S I M P L E   C A L C U L A T O R    ");
			System.out.println("----------------------------------------");
			System.out.println("             1.Sequential Programming   ");
			System.out.println("             2.Conditional Programming  ");
			System.out.println("             3.Iterative Programming    ");
			System.out.println("----------------------------------------");
			System.out.println("             0. Exit                    ");
			System.out.println("----------------------------------------");

			// Step 2 - Prompt you and accept the user's choice
			System.out.println("             Pick a function            ");
			choice = bot.nextInt();
			System.out.println("----------------------------------------");

			// Step 3 - Process the choice

			switch (choice) {
			case 1:
				calculateSequentialPrograming();
				break;

			case 2:
				calculateConditionalPrograming();
				break;

			case 3:
				calculateIteriativePrograming();
				break;
			}
		}

		// Step 4 - Good Bye
		System.out.println("----------------------------------------");
		System.out.println("           T H A N K  Y O U             ");
		System.out.println("----------------------------------------");

	}

}

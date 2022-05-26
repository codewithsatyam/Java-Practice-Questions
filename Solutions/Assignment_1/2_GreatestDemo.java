import java.util.Scanner;

public class GreatestDemo {
	public static void main(String[] args) {

		System.out.println("Enter three nos:");
		Scanner s = new Scanner(System.in);
		// Created a reference of scanner class to store the address of
		// newly created memory.

		int a = s.nextInt();  // nextInt() method is used to get integer value.
		int b = s.nextInt();
		int c = s.nextInt();

		int x = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		// ternary operator ( ?: ) used.
		// Value returned by ternary operator should be stored in variable.

		System.out.println(x + " is the greatest of all three nos.");

	}
}

/******************

output:
Enter three nos:
43 34 12
43 is the greatest of all three nos.

******************/

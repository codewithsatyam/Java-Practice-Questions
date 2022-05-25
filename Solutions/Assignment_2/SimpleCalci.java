//Program to make use of simple calculator using switch case:

import java.util.Scanner;

class SimpleCalci {

	public static void main(String[] args) {

		boolean c;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("Enter first no.:");
			int a = s.nextInt();
			System.out.print("Enter operator:");
			String ch = s.next();
			System.out.print("Enter Second no.:");
			int b = s.nextInt();

			switch (ch) {
			case "+":
				System.out.println("Addition of two nos. is :" + (a + b));
				break;
			case "-":
				System.out.println("Substraction of two nos. is :" + (a - b));
				break;
			case "X":
				System.out.println("Multiplication of two nos. is :" + (a * b));
				break;
			case "/":
				System.out.println("Division of two nos. is :" + (a / b));
				break;
			default:
				System.out.println("Wrong choice entered please try again.");
				break;
			}

			System.out.print("Do want to enter again...(true/false):");

			c = s.nextBoolean();

		} while (c == true);
		System.out.println("Program End!!!");
	}
}


/****************
output:

Enter first no.:34
Enter operator:-
Enter Second no.:37
Substraction of two nos. is :-3
Do want to enter again...(true/false):false
Program End!!!

Enter first no.:25
Enter operator:X
Enter Second no.:34
Multiplication of two nos. is :850
Do want to enter again...(true/false):true
Enter first no.:56
Enter operator:/
Enter Second no.:8
Division of two nos. is :7
Do want to enter again...(true/false):false
Program End!!!

****************/

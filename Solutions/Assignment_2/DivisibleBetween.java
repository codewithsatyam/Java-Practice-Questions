//Program to find no divisible by 3 & 5 between n1 and n2 


import java.util.Scanner;

class DivisibleBetween {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter First no.:");
		int a = s.nextInt();
		System.out.print("Enter Second no.:");
		int b = s.nextInt();

		if (a > b) {

			for (int x = b; x <= a; x++) {
				if (x % 3 == 0 && x % 5 == 0)
					System.out.print(x + " ");
			}
		} else if (a < b) {

			for (int x = a; x <= b; x++) {
				if (x % 3 == 0 && x % 5 == 0)
					System.out.print(x + " ");
			}

		}

		else
			System.out.print("Both are equal, please try again!!!");

	}
}

/***********
output:
Enter First no.:30
Enter Second no.:10
15 30

Enter First no.:10
Enter Second no.:10
Both are equal, please try again!!!

************/

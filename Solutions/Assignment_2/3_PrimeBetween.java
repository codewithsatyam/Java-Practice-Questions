//WAP to find prime numbers between two numbers.

import java.util.Scanner;

class PrimeBetween {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("PrimeBetween Program");
		System.out.print("Enters two numbers:");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int i = 2;
		outer: for (; n2 >= n1; n2--) {
			for (i = 2; i < n2; i++) {
				if (n2 % i == 0)
					continue outer;
			}

			System.out.print(n2 + " ");
		}
	}
}

/************
output:
Enters two numbers:10 20
19 17 13 11
************/

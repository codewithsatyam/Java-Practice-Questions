//WAP to find pth even number between two numbers.

import java.util.Scanner;

class Kth_EvenNumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Kth_EvenNumber Program");
		System.out.print("Enters two numbers:");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int count = 0;
		System.out.print("Enter the pth number you want even numbers for:");
		int p = s.nextInt();

		for (; n1 <= n2; n1++) {
			if (n1 % 2 == 0) {
				count++;
				if (count % p == 0)
					System.out.print(n1 + " ");
			}
		}
	}
}

/*************
output:
Enters two numbers:2 20
Enter the pth number you want even numbers for:3
6 12 18

**************/

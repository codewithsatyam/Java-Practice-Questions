//WAP to find kth digit in given number.

import java.util.Scanner;

//import java.lang.Math.pow();
class KthDigit {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("KthDigit Program");
		System.out.print("Enters a number:");
		int n = s.nextInt();
		int num = n;
		int count = 0;

		System.out.print("Enter the kth digit you want to find(right to left):");
		int k = s.nextInt();

		while (num > 0) {
			num = num / 10;
			count++;
		}
		if (k > count)
			System.out.print(k + " digit not found!!!");
		else {
			int n1 = (int) Math.pow(10, k);
			int n2 = (int) Math.pow(10, k - 1);
			int result = (n % n1) / n2;
			System.out.print(result + " is the " + k + "th digit.");
		}
	}
}

/**********
output:
KthDigit Program
Enters a number:3456789
Enter the kth digit you want to find(right to left):6
4 is the 6th digit.

KthDigit Program
Enters a number:23456789
Enter the kth digit you want to find(right to left):9
9 digit not found!!!

***********/

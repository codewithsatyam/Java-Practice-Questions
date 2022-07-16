//WAP to calculate the sum of both even and odd terms in the array.

import java.util.Scanner;

class SumArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int even_sum = 0;
		int odd_sum = 0;
		System.out.print("Enter the size of the array:");
		int[] arr = new int[s.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + i + " value of Array:");
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				even_sum = even_sum + arr[i];
			else
				odd_sum = odd_sum + arr[i];
		}
		System.out.println("Sum of both even and odd terms is:" + (even_sum + odd_sum));
	}
}

/**********
output:
Enter the size of the array:5
Enter the 0 value of Array:5
Enter the 1 value of Array:1
Enter the 2 value of Array:2
Enter the 3 value of Array:3
Enter the 4 value of Array:4
Sum of both even and odd terms is:15

***********/

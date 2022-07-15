//WAP to Reverse the original array without using the another array.


import java.util.Scanner;

class ReverseArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int[] arr = new int[s.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the " + i + " value of Array:");
			arr[i] = s.nextInt();
		}

		System.out.print("Array in orignal form:");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.print("Modified Array in Reversed Order:");
		int temp = arr[0];
		for (int i = 0, j = (arr.length - 1); i < (arr.length / 2) || j > (arr.length / 2); i++, j--) {
			arr[i] = arr[j];
			arr[j] = temp;
			temp = arr[i + 1];
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}

/************
output:

Enter the size of the array:5
Enter the 0 value of Array:2
Enter the 1 value of Array:3
Enter the 2 value of Array:4
Enter the 3 value of Array:5
Enter the 4 value of Array:6
Array in orignal form:2 3 4 5 6
Modified Array in Reversed Order:6 5 4 3 2

*************/

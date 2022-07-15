//WAP to calculate the most repeated element in the array.


import java.util.Scanner;

class FrequencyArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max_frequency = 0;
		int rep_elem = 0;
		System.out.print("Enter the size of array:");
		int[] arr = new int[s.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Element of Array:");
			arr[i] = s.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])
					count++;

			}
			if (count > max_frequency) {
				max_frequency = count;
				rep_elem = arr[i];
			}
		}
		if (max_frequency == 1)
			System.out.println("All element has same frequency");
		else
			System.out.println("Most repeated element in the array:" + rep_elem);

	}
}

/*********
output:

Enter the size of array:7
Enter 1 Element of Array:2
Enter 2 Element of Array:3
Enter 3 Element of Array:4
Enter 4 Element of Array:3
Enter 5 Element of Array:3
Enter 6 Element of Array:4
Enter 7 Element of Array:2
Most repeated element in the array:3

**********/

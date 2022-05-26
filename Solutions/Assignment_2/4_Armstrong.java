//wAP to find whether a given no is armstrong or not.

import java.util.Scanner;

class Armstrong {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a no. between range 1<=n<=4 :");
		int n = s.nextInt();
		int num_copy = n;
		int num, cube, result = 0;
		while (true) {

			num = n % 10;
			n = n / 10;
			cube = (num * num * num);
			result = result + cube;
			if (n == 0)
				break;
		}
		if (result == num_copy)
			System.out.print("Armstrong Number!!!");
		else
			System.out.print("Not Armstrong Number!!!");

	}
}

/***********
output:
Enter a no. between range 1<=n<=4 :153
Armstrong Number!!!

Enter a no. between range 1<=n<=4 :120
Not Armstrong Number!!!

***********/

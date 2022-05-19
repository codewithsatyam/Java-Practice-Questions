//Simple program to test your grip on if-else

class PassFail {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);

		if (a >= 35 && b >= 35 && c >= 35 && d >= 35 && e >= 35)
			System.out.println("Passed in all Subjects");
		else {
			System.out.print("Failed");
			if (a < 35)
				System.out.print(" 1");
			if (b < 35)
				System.out.print(" 2");
			if (c < 35)
				System.out.print(" 3");
			if (d < 35)
				System.out.print(" 4");
			if (e < 35)
				System.out.print(" 5");
		}
	}
}

//Input is taken from command prompt.
/*************
Output:
78 34 89 64 21
Failed 2 5
*************/

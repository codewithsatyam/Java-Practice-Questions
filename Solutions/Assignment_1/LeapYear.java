//Program to calculate leap year just using if-else.


class LeapYear {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		if ((1900+a) >= 1901 && (1900+a) <= 1999) {
			if ((1900+a) % 4 == 0 || ((1900+a) % 400 == 0 && (1900+a) % 100 != 0))
				System.out.println("Leap Year");
			else
				System.out.println("Not a leap year");
		} else
			System.out.println("Wrong Choice Entered please try again!!!");
	}
}


/***********
Output: Input is taken from command prompt and output is displayed there itself.
************/

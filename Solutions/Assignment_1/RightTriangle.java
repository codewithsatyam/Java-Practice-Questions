
import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {

		System.out.println("Enter three sides of Triangle:");
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if ((a * a) + (b * b) == (c * c)) {
			System.out.println("1");

		} else if ((a * a) + (c * c) == (b * b)) {
			System.out.println("1");

		} else if ((b * b) + (c * c) == (a * a)) {
			System.out.println("1");

		} else
			System.out.println("-1");

	}
}

/**************

output:
Enter three sides of Triangle:
4 5 3 
1

***************/

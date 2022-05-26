import java.util.Scanner;

class AbsoluteDemo {
	public static void main(String[] args) {
	    
		Scanner s = new Scanner(System.in);  
		//creating reference of scanner class to store the address of newly created object.
		//Scanner gets connected to keyboard via System.in
		
		System.out.println("Enter a no to get its absolute value:");
		int x = s.nextInt(); 
		//nextInt() method is used to enter no.
		
		int y = (x > 0) ? x : -x;  
		//using ternary operator.
		//Value returned by ternary operator should be stored.
		
		System.out.println("Absolute value is:" + y);
	}
}

/***************
output:
Enter a no to get its absolute value:
-1
Absolute value is:1

***************/

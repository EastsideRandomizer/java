import java.util.*;
public class invert {
    public static void main(String[] args){
	/* Declare variables */
	int num1;
	final int hundred = 100;
	final int ten = 10;
	int output;
	/* Initate Scanner */
	Scanner scan = new Scanner(System.in);
	/* Ask for input */
	System.out.println("Please Enter a three-digit number:");
	num1 = scan.nextInt();
	if (num1 > 999 || num1 < 100) {
	    System.out.println("You have entered something that is not between 100 and 999. Exiting.");
	}
	else {
	    int num2 = num1 / hundred;
	    int hundredRemainder = num1 % hundred;
	    int num3 = hundredRemainder / ten;
	    int tenRemainder = hundredRemainder % ten;
	    output = tenRemainder * 100 + num3 *10 + num2;
	    System.out.println("Output: " + output);
	}
    }
}

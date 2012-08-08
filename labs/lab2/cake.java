/* imports math class */
import java.util.*;
import java.text.*;
public class cake {
    public static void main(String[] args){
	/* declares variables */
	double radius;
	int noGuests;
	double circumference;
	final double pie=Math.PI;
	/* initalizes scanner */
	Scanner scan = new Scanner(System.in);
	/* Ask for the radius of the cake */
	System.out.println("Please Enter the radius of the cake (in cms):");
	radius = scan.nextDouble();
	/* Ask for the number of guests */
	System.out.println("Please Enter the number of guests");
	noGuests = scan.nextInt();
	/* Rounds things up */
	DecimalFormat output = new DecimalFormat("0.##");
	/* Calculates the circumference of the cake */
	circumference = 2 * pie * radius;
	/* Prints the value of circumference */
	System.out.println("total arc (Circumference): " + output.format(circumference));
	/* declares more variables */
	double arcSlice;
	double arcUsed;
	double leftOver;
	/* calculates the arc of each slice */
	arcSlice = (int)circumference / noGuests;
	System.out.println("slice arc: " + output.format(arcSlice) + " cm");
	/* calulates arc used */
	arcUsed = arcSlice * noGuests;
	System.out.println("arc used: " + output.format(arcUsed) + " cm");
	/* calculate how much is left after slicing */
	leftOver = circumference - arcUsed;
	System.out.println("left over arc: " + output.format(leftOver) + " cm");
    }
}
import java.util.*;
import java.text.*;
public class licensePlate {
    public static void main (String[] args){
	/* Initiates Scanner */
	Scanner scan = new Scanner(System.in);
	/* Declares variables */
	String name = " ";
	double number = Math.random() * 1000 ;
	/* Ask for a name */
	System.out.println("Please Enter name:");
	name = scan.nextLine();
	/* converts to Upper Case */
	name = name.toUpperCase();
	/* retrieve the length of name */
	int nameLength = name.length();

	/* rounds the number to the nearest Integer */
	DecimalFormat grade = new DecimalFormat("0");

	/* Mutliplies the length of the name so that it can be used. */
	double nameLetter1 = Math.random() * nameLength;
	double nameLetter2 = Math.random() * nameLength;
	double nameLetter3 = Math.random() * nameLength;
	
	/* rounds all nameletter
	nameLetter1 = grade.format(nameLetter1);
	nameLetter2 = grade.format(nameLetter2);
	nameLetter3 = grade.format(nameLetter3);
	*/

	/* prints the License Plate  */
	System.out.println(name.substring((int)nameLetter1,(int)nameLetter1+1) + name.substring((int)nameLetter2,(int)nameLetter2+1) + name.substring((int)nameLetter3,(int)nameLetter3+1) + grade.format(number));
	
	
    }
}
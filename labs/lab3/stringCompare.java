import java.util.*;
public class stringCompare {
    public static void main(String[] args){
	/* Declare variables */
	String string1;
	String string2;
	/* Initate Scanner */
	Scanner scan = new Scanner(System.in);
 	/*Enter two strings */
	System.out.println("Please Enter a string:");
	string1 = scan.nextLine();
	System.out.println("Please Enter another string:");
	string2 = scan.nextLine();
	/* compares the strings */
	if(string1.equals(string2)){
	    System.out.println("Both strings are the same."); 
	}
	else{
	    System.out.println("Both strings are not the same."); 
	}
    }
}

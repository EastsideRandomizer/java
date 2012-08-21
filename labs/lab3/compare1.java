import java.util.*;
public class compare1 {
    public static void main(String[] args){
	/* Declare variables */
	int num1 = 0;
	int num2 = 0;
	/* Initate Scanner */
	Scanner scan = new Scanner(System.in);
	/*Enter two numbers */
	System.out.println("Please Enter a integer:");
	num1 = scan.nextInt();
	System.out.println("Please Enter another integer:");
	num2 = scan.nextInt();
	/* Compare them */
	if(num1 > num2){
	    System.out.println("Value in descending order:" + num1 + ", "  + num2 );	    
	}
	else if (num2 > num1){
	    System.out.println("Value in descending order:" + num2 +  ", " +  num1 );	    
	}
	else {
	    System.out.println("You have entered something that is not an integer. Exiting." );	  
	}	    
    }
}

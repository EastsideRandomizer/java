import java.util.*;
public class question3 {
    public static void main(String[] args){
	int upperSum = 0;
	int lowerSum = 0;
	/* Declare variables */
	String string;
	/* Initate Scanner */
	Scanner scan = new Scanner(System.in);
 	/*Enter two strings */
	System.out.println("Please Enter a string:");
	string = scan.nextLine();
	while (! string.equalsIgnoreCase("exit")){
	    for ( int i = 0 ; i < string.length(); i++){
			/* Not allowed to use isUpperCase (sigh, programming is meant to be as efficent as one can in FIT1002 this doesn't happen. gg Java) */
			//	char j = string.charAt(i);
			// if (Character.isUpperCase(j)) {
			//	upperSum++;
			// }
			// else if (Character.isLowerCase(j)) {
			//	lowerSum++;
			// }
			// }
			/* Runs through the ASCII table for decimal value of 
		   each uppercase character and compare it to the string */
		 for(char u='A'; u<='Z'; u++){
		    if (string.charAt(i) == u)
			{
			    upperSum++;
			}
		}
	   
		/* Runs through the ASCII table for decimal value of 
		   each lower character and compare it to the string */
	    	for(char l='a'; l<='z'; l++){
				if (string.charAt(i) == l)
					{
						lowerSum++;
					}
			}	
	}
	
	System.out.println("Please Enter Another string:");
	string = scan.nextLine();	    
	}
	/* exits with the amount shown */
	System.out.println("Amount of Uppercase :" + upperSum);
	System.out.println("Amount of lowercase :" + lowerSum);	
	}
}

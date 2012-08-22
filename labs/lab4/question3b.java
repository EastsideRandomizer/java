import java.util.*;
public class question3b {
    public static void main(String[] args){
                final int AGE = 20;
                int input = 0 ;
                int integer;
                System.out.println("Guess an age:");
                Scanner scan = new Scanner(System.in);
				input = scan.nextInt();

				while(input != AGE){
					if (input > AGE) {
						System.out.println("Your guessed Age is too old. Try again.");
					}
					else {
						System.out.println("Your guessed Age is too young. Try again.");
					}	                
					input = scan.nextInt();
				}
                System.out.println("Your have guessed it. It's 20.");
	}
}
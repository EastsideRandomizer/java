import java.util.*;
public class question3a {
    public static void main(String[] args){
                final int AGE = 20;
                int input = 0 ;
                int integer;
                System.out.println("Guess an age:");
                Scanner scan = new Scanner(System.in);
				input = scan.nextInt();

				while(input != AGE){
					System.out.println("Your guess is not correct. Try again.");
	                input = scan.nextInt();
				}
                System.out.println("Your have guessed it. It's 20.");
        	}
}



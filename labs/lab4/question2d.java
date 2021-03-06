import java.util.Arrays;
import java.util.*;
public class question2d {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int length = 0;
        char c  = '*';
        System.out.println("Please enter an integer:");
		int n = scan.nextInt();
        System.out.println("Please decide whether it is upside down or not (True/false):");
		boolean isUpSideDown = scan.nextBoolean();	
		

		if (isUpSideDown == false) {
        /* the loop executes n times */
        for(int i = 0; i <= (n - 1); i++){
			length = i+1;
			/*declares an array so that a number of characters can be filled
			  In this case arrays are used because it makes life easier. */
			char[] chars = new char[length];
			/* fills up the array with "*" */ 
			Arrays.fill(chars, c);
			/*prints out the string defined by the array*/
			System.out.println(String.valueOf(chars));
        }
		}
		else {
			/* this loops executes n times in reverse */
			for(int j = n-1 ; j >= 0 ; j--){
				length  = j ;
				/*Since the array length cannot be changed on the fly. initalise another array */
				char[] chars = new char[length];
				/* fills up the array with "*" */ 
				Arrays.fill(chars, c);
				/*prints out the string defined by the array*/
				System.out.println(String.valueOf(chars));
			}
		}
    }
}

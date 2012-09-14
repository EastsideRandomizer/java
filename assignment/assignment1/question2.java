import java.util.*;

public class question2 {


	public static void main(String[] args) {
	    String string,string2 = "" ;
		int left, right;
		int counter = 0;
		Scanner scan = new Scanner (System.in);

		System.out.println("Please enter a potential palindrome:");
		string = scan.nextLine();
		/* Starts a new string which is string converted to lower case*/
		String str = string.toLowerCase();
		/* Line below is for debugging and hence commented out */
		// System.out.println (str);
		left = 0;

		/* runs through the whole string and removes spaces */
		for (int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ' '){
			    string2 += str.charAt(i);
			}
		}
		/* uses the same code from Q1.c of lab of week 5 */
		right = string2.length() - 1;
		
		/* The line below is for debugging and hence commented out.*/
		// System.out.println (string2);
		/* increments the opreator if the character are the same and the right counter is larger than the counter */
		while (string2.charAt(left) == string2.charAt(right) && left < right) {
			left++;	
			right--;	
		}

		System.out.println();

		/* Because right is always larger than right if charAt(left) != charAt(right, hence it is not a palindrome. */
		if (left < right)
			System.out.println ("That string is NOT a palindrome.");
		else
			System.out.println ("That string IS a palindrome.");
	}
}

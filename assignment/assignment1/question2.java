import java.util.*;

public class question2 {


	public static void main(String[] args) {
	    String string,string2 = "" ;
		int left, right;
		int counter = 0;
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter a potential palindrome:");
		string = scan.nextLine();
		String str = string.toLowerCase();
		System.out.println (str);
		left = 0;

		/* runs through the whole string and removes spaces */
		for (int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ' '){
			    string2 += str.charAt(i);
			}
		}
		right = string2.length() - 1;
		System.out.println (string2);
		while (string2.charAt(left) == string2.charAt(right) && left < right) {
			left++;	
			right--;	
		} //close inner while

		System.out.println();

		if (left < right)
			System.out.println ("That string is NOT a palindrome.");
		else
			System.out.println ("That string IS a palindrome.");
	}
}

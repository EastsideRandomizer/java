import java.util.*;
import java.text.*;
public class question1b {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	/* Declares variables */
	String name = " ";
	/* Ask for a name */
	System.out.println("Please a string:");
	name = scan.nextLine();
	/* retrieve the length of name */
	int nameLength = name.length() - 1;
	for(int i = nameLength ; i >= 0; i--){
		System.out.print(name.charAt(i));
	}
	}
}


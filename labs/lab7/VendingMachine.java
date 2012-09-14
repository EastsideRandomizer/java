import java.util.*;
public class VendingMachine {
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args){
		String menu;
		menu = "[A] Get gum \n [A] Get gum \n [C] Get popcorn \n [D]Get Juice \n [E] Display total numbers of items sold so far \n [X] Exit.";
		prompt = "Please enter your choice";
		displayMenu(menu, prompt)
	}
	
	public static void displayMenu(String menu, String prompt){
		System.out.println(menu);
		System.out.println(prompt);
	}
	public static char getUserChoice(){
		choice = scan.nextChar();
		validateUserChoice(choice);
	}

	public static boolean validateUserChoice(char testCase){
		if ((testCase >=65 && testCase <= 69) || (testCase >=97 && testCase <= 101) || testCase == 88 || testCase == 120){
			return true;
		}
		else 
			return false
				}
}

	
}

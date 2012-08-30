import java.util.Scanner;

public class menu
{

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Menu Option(Please Enter a number):" );
		System.out.println("1. Odd integers");
		System.out.println("2. Divisibles");
		System.out.println("3. Exit");
		System.out.println("Your Choice: ");
		option();
	}
	
	public static void option(){
		int choice;
		choice = scan.nextInt();
		if (choice == 1){
			odd();
			exit();
		}
		else if(choice == 2){
			division();
			exit();
		}
		else if(choice == 3){
			exit();
		}
		else{
			System.out.println("Please Enter an integer between 0 and 3");
			option();
		}
	}

	public static void odd(){
		int int1, int2;
		final int DIVISOR = 2;
		int increment;
		System.out.println("Please Enter an integer");
		int1 = scan.nextInt();
		System.out.println("Please Enter another integer");
		int2 = scan.nextInt();
		for (int i = int1 ; int2 >= i ; i++){
			increment=int1++;
			int remainder=increment % 2;
			if (remainder < int2 ){
				System.out.print(increment);
				System.out.print(", "); 
			}
			else{
				System.out.print(increment);
				System.out.print(", "); 
			} 
		}
	}
	
	public static void division(){
		int int1, int2;
		int divisor;
		int increment;
		System.out.println("Please Enter an integer");
		int1 = scan.nextInt();
		System.out.println("Please Enter another integer");
		int2 = scan.nextInt();
		System.out.println("Please Enter another integer to be the divisor");
		divisor = scan.nextInt();		
		for (int i = int1 ; int2 >= i ; i++){
			increment=int1++;
			int remainder = increment % divisor;
			if (remainder == 0){
				System.out.print(increment);
				System.out.print(" "); 
			}
		}
	}
	
	public static void exit(){
    System.out.println("Exiting.");
	}
}
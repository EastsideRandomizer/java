import java.util.Scanner;

public class Calculator
{
	static Scanner scan = new Scanner(System.in);
	static int choice, val1, val2, result;
	public static void main(String[] args)
	 {
		System.out.println("Welcome to Lab 6");
		System.out.println("You will have 4 opportunities to choose what calculations to do");
		for (int i = 0; i < 3; i++){
		System.out.println("Opportunity #" + (i+1) );
		System.out.println("1. Do an addition");
		System.out.println("2. Do a subtraction");
		System.out.println("3. Do a multiplication");
		System.out.println("4. Do an integer division");
		
		System.out.print("Your Choice: ");
		choice = scan.nextInt();
		
		 if (choice == 1){
			 sum();
		 }
		 else if (choice == 2){
			difference();
		 }
		 else if (choice == 3){
			 product();
		 }
		 else if (choice == 4){
			 remainder();
		 }
		 else {
			 error();
		 }
		}
	}
	
	public static void error(){
		System.out.println("Invalid Choice. You wasted an opportunity!");
	}
	
	public static void sum(){ 
		System.out.print("Enter first number: ");
		val1 = scan.nextInt();
		System.out.print("Enter second number: ");
		val2 = scan.nextInt();
		
		result = val1 + val2;
		System.out.println("The sum of " + val1 + " and " + val2 + " is " + result);
	}
	
	
	public static void difference(){
		System.out.print("Enter first number: ");
			val1 = scan.nextInt();
			System.out.print("Enter second number: ");
			val2 = scan.nextInt();
			result = val1 - val2;
			System.out.println("The result of subtracting " + val2 + " from " + val1 + " is " + result);			
	}
	
	public static int product(){
			System.out.print("Enter first number: ");
			val1 = scan.nextInt();
			System.out.print("Enter second number: ");
			val2 = scan.nextInt();
			
			result = val1 * val2;
			System.out.println("Multiplying " + val1 + " and " + val2 + " gives " + result);

			return 0;
		}
	public static int remainder(){
			System.out.print("Enter first number: ");
			val1 = scan.nextInt();
			System.out.print("Enter second number: ");
			val2 = scan.nextInt();
			
			result = val1 / val2;
			System.out.println("The sum of integer division of " + val1 + " by " + val2 + " is " + result);
			return 0;
	}

}


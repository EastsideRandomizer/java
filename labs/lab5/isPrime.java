import java.util.Scanner;

public class isPrime
{
	static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
		int number;
		int result;
		System.out.println("Please Enter a number:");
		number = scan.nextInt();
		check(number);
	    result = check(number);
		if (result == 1){
			System.out.println( number + " is a Prime number");
				}
		else{
			System.out.println( number + " is not a Prime number");
			}
	}
	static int check(int b){
		int i;
		/* Start dividing by until denominator is smaller than the number by 1 */

		for (i = 2 ; i <= b-1 ; i++){
			if ( b % i == 0) {
				return 0;
			}
		}
			if ( b == i){
				return 1;
			}
		return 0;
	}
}
import java.util.*;
public class question1a {
    public static void main(String[] args){
		final int SENTINEL = 0;
		int sum = 0 ;
		int integer;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Input a integer.zero terminates this program:");
			integer = scan.nextInt();
		while(integer != SENTINEL){
			if ( integer % 2 == 0 ) {
			sum = sum + integer;
			System.out.println("Total running even sum: " + sum);
			System.out.println("Please Input another even integer.zero terminates this program:");
			integer = scan.nextInt();}
			else{
				System.out.println("Please Input a even integer.zero terminates this program:");
				integer = scan.nextInt();}
		}
		
		
	}
}
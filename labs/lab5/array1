import java.util.*;
public class array {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] chars = {'a','b','a','c','b','a','d','a','f','d'};
		char test;
		boolean isFound = false ;
		int counter = 0;
		/*prints out the string defined by the array*/
		System.out.println(String.valueOf(chars));
		System.out.println("Please Enter the char you want to find above");
		test = scan.next().charAt(0);
		for (int i = 0; i < chars.length; i++){
			if(chars[i] == test){
				isFound = true;
		counter++;
		System.out.println(chars[i] + " is located at index: " + i);
			}
		}
		System.out.println("Total number of occurences: " + counter);
		if(isFound == false){
			System.out.println(test + " is not present in this array" );
		}		
	}
}

import java.util.*;
public class array1 {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char[] chars = {'a','b','a','c','b','a','d','a','f','d'};
		char test;
		boolean isFound = false ;
		/*prints out the string defined by the array*/
		System.out.println(String.valueOf(chars));
		System.out.println("Please Enter the char you want to find above");
		test = scan.next().charAt(0);
		for (int i = 0; i < chars.length && !isFound ; i++){
			if(test == chars[i]){
				isFound = true;
				System.out.println(chars[i] + " is located at index: " + i);
			}
		}

		if(isFound == false){
			System.out.println(test + " is not present in this array" );
		}		
	}
}

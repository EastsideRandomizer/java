import java.util.Arrays;
import java.util.*;
public class question2e {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int length = 0;
        char c  = '*';
        System.out.println("Please enter an integer:");
	int n = scan.nextInt();
        System.out.println("Please enter an integer:");
        int m = scan.nextInt(); 
        for(int k = 0; k <= (m - 1); k++){
        /* the loop executes 3 times */
        for(int i = 0; i <= (n - 1); i++){
        length = i+1;
        /*declares an array so that a number of characters can be filled
	In this case arrays are used because it makes life easier.
			 */
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        /*prints out the string defined by the array*/
        System.out.println(String.valueOf(chars));
        }
        /* the loops runs on depending how many times the loop above is run */
        for(int j =  ( n - 1 ) ; j >= 1 ; j--){
        length  = j ;
        /*Since the array length cannot be changed on the fly we reinitalise
		 the length of array again. Damn you java.*/
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        /*prints out the string defined by the array*/
        System.out.println(String.valueOf(chars));
        }
    }
}
}

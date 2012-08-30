import java.util.Arrays;
public class question2b {
    public static void main(String[] args){
        int length = 0;
        char c  = '*';
		/* i must be defined here to have a global scope */
	    int i = 0;
        /* the loop executes 3 times */
        for(i = 0; i <= 2; i++){
        length = i+1;
        /*declares an array so that a number of characters can be filled.
		  In this case arrays are used because it makes life easier.
		 */
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        /*prints out the string defined by the array*/
        System.out.println(String.valueOf(chars));
        }
        /* the loops runs on depending how many times the loop above is run */
        for(int j =  ( i - 1 ) ; j >= 1 ; j--){
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

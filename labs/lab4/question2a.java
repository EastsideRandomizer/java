import java.util.Arrays;
public class question2a {
    public static void main(String[] args){
	int length = 0;
	char c  = '*';
	/* the loop executes 3 times */
	for(int i = 0; i <= 2; i++){
	length  = i+1;
	/*declares an array so that a number of characters can be filled */
        char[] chars = new char[length];
	Arrays.fill(chars, c);
	/*prints out the string defined by the array*/
        System.out.println(String.valueOf(chars));
	}
    }
}

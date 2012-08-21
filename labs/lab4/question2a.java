import java.util.Arrays;
public class question2a {
    public static void main(String[] args){
	int length = 0;
	char c  = '*';
	char[] chars = new char[length];
	for(int i = 0; i <= 3; i++){
	length  = i++;
	Arrays.fill(chars, c);
        System.out.println(String.valueOf(chars));
	}
    }
}
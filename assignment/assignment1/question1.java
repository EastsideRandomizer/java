import java.util.Arrays;
import java.util.*;
public class question1 {
    public static void main(String[] args){
        final int LENGTH = 10;
		for(int i = 0 ; i < LENGTH ; i++){
		    for(int j = i+1 ; j > 0 ; j--){
			if(j == 1){
			    System.out.println(j);
			}
			else {
			    System.out.print(j + ", ");
			}			    
		    }
		}
    }	
}
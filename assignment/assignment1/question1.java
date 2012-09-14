import java.util.*;
public class question1 {
    public static void main(String[] args){
        final int LENGTH = 10;
		int i;
		int j;
		for( i = 1 ; i <= LENGTH ; i++){
			if (i % 2 == 0){
				for( j = i ; j > 0 ; j--){
					if(j == 1){
						System.out.println(j);
			}
					else {
						System.out.print(j + ", ");
					}			    
				}
			}
			if (i % 2 == 1){
				for(int k = 1 ; k <= i ; k++){
					if(k == i){
						System.out.println(k);
					}
					else {
						System.out.print(k + ", ");
					}			    
				}
			}
		}	
	}
}
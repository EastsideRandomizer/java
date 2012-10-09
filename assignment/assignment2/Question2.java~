import java.util.*;
public class Question2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
	int[] a;
	a = new int[3];
	int counter = 0;
	System.out.println("Enter an Integer:");	    
	a[counter] = scan.nextInt();
	counter++;
	while ( counter < a.length ) {
	    System.out.println("Enter an Integer:");
	    a[counter] = scan.nextInt();
	    if(counter == 1 && a[counter] != a[counter-1]){
		counter++;
	    }	
	    else if(counter == 2 && a[counter] != a[counter-1]  && a[counter] != a[counter-2] ){
		counter++;
	    }	 
	}

	System.out.println("First three integers are");	    
	for(int i = 0 ; i < a.length ; i++) {
	    System.out.print(a[i]);
	    System.out.print(" ");	
	}
    }
}
				

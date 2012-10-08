import java.util.*;
public class process{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
	int[] a;
	a = new int[10];
	int counter = 0;
	final int STOP = -1;
	boolean isStop = false;
	
	System.out.println("Enter an integer (-1 to Stop):");
	a[counter] = scan.nextInt();
	while ( isStop != true ){
	    if ( a[counter] > 0){
		counter++;
		System.out.println("Enter another Integer:");	    
		a[counter] = scan.nextInt();
		if (counter == a.length -1){
		    isStop = true;
		}
	    }
	    else if (a[counter] == STOP){
		isStop = true;
	    }
	    if ( a [counter] <= 0 && a[counter] != STOP ){
		System.out.println("please enter a positive. Integer:");	    
		a[counter] = scan.nextInt();
	    } 
	}	
	
	System.out.print("Number entered in reverse order :");
			 for ( int i = counter - 1 ; i >= 0 ; i--){
	    System.out.print(a[i]);
	    System.out.print(" ");
	}
	    System.out.println("");
    }
}


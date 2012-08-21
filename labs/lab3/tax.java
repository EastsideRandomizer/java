import java.util.*;
import java.text.*;
public class tax {
    public static void main(String[] args){
	/* declares variables */
	double salary;
	final double BRACKET1 = 6000;
	final double BRACKET2 = 25000;
	final double BRACKET3 = 75000;
	final double BRACKET4 = 150000;
	final double TAXRATE1 = 0.15;
	final double TAXRATE2 = 0.30;
	final double TAXRATE3 = 0.40;
	final double TAXRATE4 = 0.45;
	double tax; 

	/* Initate Scanner */	
	Scanner scan = new Scanner(System.in);
	NumberFormat nform = NumberFormat.getCurrencyInstance();

	/* ask for salary input */
	System.out.println("Please Enter salary (in dollars):");
	salary = scan.nextDouble();

	/* calculates the tax based on the salary */
	if(salary <= BRACKET1){
	    tax=0;
	    System.out.println("Amount of Tax:" + nform.format(tax));
	}
	else if (salary >= (BRACKET1 + 1) && salary <= BRACKET2){
	    tax= (salary - BRACKET1) * TAXRATE1;
	    System.out.println("Amount of Tax:" + nform.format(tax));
	}
	else if (salary >= (BRACKET2 + 1) && salary <= BRACKET3){
	    tax= 2850 + (salary - BRACKET2) * TAXRATE2;
	    System.out.println("Amount of Tax:" + nform.format(tax));
	}
	else if (salary >= (BRACKET3 + 1) && salary <= BRACKET4){
	    tax= 17850 + (salary - BRACKET3) * TAXRATE3;
	    System.out.println("Amount of Tax:" + nform.format(tax));
	}
	else if (salary >= (BRACKET4 + 1)){
	    tax = 47850 + (salary - BRACKET4) * TAXRATE4;
	    System.out.println("Amount of Tax:" + nform.format(tax));
	}
	else{
	    System.out.println("Did you even put your salary in? No you didn't");
	}
    }
}

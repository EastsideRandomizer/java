import java.util.*;
public class Form {
    public static void main(String[] args){
	/* initalies variable */
	int age = 0 ;
	String lastName = " ";
	String firstName = " ";
	String level = " ";
	int moneyPaid = 0;
	int lessons =0 ;
	final int COST=50;
	/* Initate Scanner */
	Scanner scan = new Scanner(System.in);
	
	/* Ask for personal data */
	System.out.println("Enter Surname: ");
	lastName = scan.next();
	System.out.println("Enter inital of first name: ");
	firstName = scan.next();
	System.out.println("Enter Age: ");
	age = scan.nextInt();
	System.out.println("Enter skiing level(Advanced,Intermidiate,Beginner): ");
	level = scan.next();
	System.out.println("Enter Classes Taken ($50 each): ");
	lessons = scan.nextInt();
	System.out.println("Enter amount of money paid: ");
	moneyPaid = scan.nextInt();

	/* Compute Change */
	int change = moneyPaid - ( COST * lessons);

	/* prints out data */
	System.out.println( lastName + ", " + firstName);
	System.out.println("Details: ");
	System.out.println('\t' +  "* Age " +age + " years; " + level + " Skier");
	System.out.println('\t' + "* Amount Paid: " + moneyPaid);
	System.out.println('\t' + "* Number of lessons paid for: " + lessons);
	System.out.println('\t' + "* Your change is: " + change);
    }
}

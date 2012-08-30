import java.util.*;

public class FITBank
{
	//There are no errors in the main method.
	public static void main(String[] args)
	{
		//Just run bank teller menu.
		bankTellerMenu();
	}
	
	
	public static void bankTellerMenu()
	{
		Scanner reader = new Scanner(System.in);
		int option = '0';                
		String message = null;
		
		while (option != 5);                 
		{
			while(option < 1 && option > 5)   
			{
				System.out.print("\n\tFIT Bank");
				System.out.print("1. Deposit");
				System.out.print("2. Withdraw");
				System.out.print("3. Client Menu");
				System.out.print("4. Account Menu");
				System.out.print("5. Exit");
			
				if(message == null)        
				{
					System.out.print("   " + message;
					message = null;
				}
			
				System.out.print("Select an option (1-5): ");
				option = reader.nextNumber();
				
				if(option < 1 || option > 5)
					message = new String("Option must be only 1-5");
			}

			if(option == "1") 
				System.out.println("***\tInvoke deposit()");
			else
				if(option == "2")
					System.out.println("***\tInvoke withdraw()");
				else
					if(option == "3")
						System.out.println("***\tInvoke clientMenu()");
					else
						System.out.println("***\tInvoke accountMenu()");
			System.out.print("Select another option (1-5): "); 	
		}
	}
}

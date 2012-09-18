public class FriendDriver
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
	    Friend friend1 = new Friend();
	    Friend friend2 = new Friend();
	    Friend friend3 = new Friend();
		System.out.println("Menu Option(Please Enter a number):" );
		System.out.println("1. Display All Friends");
		System.out.println("2. Update a friend's details");
		System.out.println("3. List a month's Birthdays");
		System.out.println("4. Rank your friends");
		System.out.println("5. Exit");
		System.out.println("Your Choice: ");
		option();
	}
	
	public static void option(){
		int choice;
		choice = scan.nextInt();
		if (choice == 1){
			displayFriend();
			
		}
		else if(choice == 2){
			updateDetails();
		      
		}
		else if(choice == 3){
			showBirthday();
		}
		else if(choice == 4){
			rankFriends();
		}
		else{
			System.out.println("Please Enter an integer between 1 and 5");
			option();
		}
	}

import java.util.*;
public class PlayerTestDriver {
	public static void main(String[] args){
		Player player1 = new Player("Daniel");
		Player player2 = new Player("DJ");
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		Card card4 = new Card();

	System.out.println("We expect two random cards to be drawn for player1.");
	player1.acceptDeal(card1,card2);
	System.out.println(player1.toString());
	System.out.println("Card 1: " + card1.toString());	
	System.out.println("Card 2: " + card2.toString());	

	System.out.println("We expect two random cards to be drawn for player2.");
	player2.acceptDeal(card3,card4);
	System.out.println("Card 3: " + card3.toString());	
	System.out.println("Card 4: " + card4.toString());	

	System.out.println(player2.toString());
	System.out.println(" ");
	System.out.println("Adding sum for player 1");
	System.out.println(card1 + " + " + card2 + " = " + player1.getHandStrength());	
	System.out.println("Adding sum for player 2");
	System.out.println(card3 + " + " + card4 + " = " + player2.getHandStrength());	
	

	}
	
}


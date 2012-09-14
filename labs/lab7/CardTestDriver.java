public class CardTestDriver {
    public static void main(String[] args){
		Card testCard = new Card();
		System.out.println("Numerical = " + testCard.getValue());
		System.out.println("Numerical Name = " + testCard.getValueName());
		System.out.println("Suit = " + testCard.getSuit());
		System.out.println("Suit Name = " + testCard.getSuitName());
		System.out.println(testCard.toString());
	}
}
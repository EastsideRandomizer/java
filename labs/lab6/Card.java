public class Card {

	public static final int MAX_NUMERICAL = 13;
	private static final int MAX_SUIT = 4;
	private int numericalValue;
    private String numericalName;
	private int suitValue;
	private String suitName;

	public Card(){
		getValue();
		getSuit();
	}

	public int getValue(){
	    numericalValue = (int) ( 1 + Math.random() * MAX_NUMERICAL ) ;
		return numericalValue;
	}

	public int getSuit(){
	    suitValue = (int) ( 1 + Math.random() * MAX_SUIT ) ;
		return suitValue;
	}

	public String getValueName(){
		if(numericalValue == 1){
			numericalName = "Ace";
		}
		else if(numericalValue == 2){
			numericalName = "Two";
		}
		else if(numericalValue == 3){
			numericalName = ("Three");
		}
		else if(numericalValue == 4){
			numericalName = ("Four");
		}
		else if(numericalValue == 5){
			numericalName = ("Five");
		}
		else if(numericalValue == 6){
			numericalName = ("Six");
		}
		else if(numericalValue == 7){
			numericalName = ("Seven");
		}
		else if(numericalValue == 8){
			numericalName = ("Eight");
		}
		else if(numericalValue == 9){
			numericalName = ("Nine");
		}
		else if(numericalValue == 10){
			numericalName = ("Ten");
		}
		else if(numericalValue == 11){
			numericalName = ("Jack");
		}
		else if(numericalValue == 12){
			numericalName = ("Queen");
		}
		else if(numericalValue == 13){
			numericalName = ("King");
		}
		return numericalName;
	}

	public String  getSuitName(){
		if(suitValue == 1){
			suitName = "Spades";
		}
		else if(suitValue == 2){
			suitName = "Hearts";
		}
		else if(suitValue == 3){
			suitName = "Clubs" ;
		}
		else if(suitValue == 4){
			suitName = "Diamonds" ;
		}
		return suitName;
	}

	public String toString(){
		return ("The " + numericalName + " of "	+ suitName);
	}
}
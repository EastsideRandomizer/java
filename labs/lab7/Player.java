public class Player{
	private String name;
	private Card CardOne;
	private Card CardTwo;
	public Player(String initName){
		if(initName.equals(null)){
			System.out.println("Error: You need a name or I will call you John Doe");
		}
		else {
			name = initName;
		}
		CardOne = null;
		CardTwo = null;
	}

	public void acceptDeal(Card firstCard, Card secondCard){
	    if (firstCard == null || secondCard == null){
			System.out.println("Error: One of the cards has the value of null");
		}
		CardOne= firstCard;
		CardTwo= secondCard;
	}		

	public int getHandStrength(){
		int totalValue = CardOne.returnValue() + CardTwo.returnValue();
		return totalValue;
	}						

	public String toString(){
		return name + "(" +  CardOne.returnValue() + "," + CardTwo.returnValue() + ")";
	}
}
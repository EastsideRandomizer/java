
public class Coin {
	private boolean isHeads ;
	public Coin(){
		toss();
	}

	public void toss(){
		if (Math.random() >=0.5) {
			isHeads = true;
		}
		else {
			isHeads = false;
		}
	}
	public boolean getIsHeads(){
		return isHeads;
	}
}
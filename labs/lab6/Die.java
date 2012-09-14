public class Die {

	public static final int MAX_VALUE = 6;
	int faceValue;

	public Die(){
		roll();
	}

	public void roll(){
	    faceValue = (int) ( 1+ Math.random() * MAX_VALUE ) ;
	}
	public int getFaceValue(){
		return faceValue;
	}

}
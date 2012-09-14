import java.util.*;
public class DieGuessingGame {
    public static void main(String[] args){
                
                int wrongGuess = 0;
                int correctGuess = 0;
				Die guessDie = new Die();		   
                Scanner scan = new Scanner(System.in);
						System.out.println("Guess a value from 0 to 6, Type N to exit.");				
				String guess = scan.next();
				while (guess.charAt(0) !='N') {
				guessDie.roll();
					if (Integer.parseInt(guess) == guessDie.getFaceValue()){
						System.out.println("Your guess is correct and the value is: " + guessDie.getFaceValue());
						correctGuess++;
					}
					else {
						System.out.println("Your guess is NOT correct and the value is: " + guessDie.getFaceValue());
						wrongGuess++;
					}
						System.out.println("Guess a value from 0 to 6, Type N to exit.");				
				guess = scan.next();
				}
				System.out.println("Exiting. Number of Correct Guesses:" +correctGuess + " and number of wrong guesses:" + wrongGuess);
	}
}			
	
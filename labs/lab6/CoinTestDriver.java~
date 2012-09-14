/**
 * Coin Test Driver
 * 
 * The Coin Test Driver will instantiate two Coin objects, and then perform a
 * series of tests to ensure that the coins operate independently and generate
 * sensible numbers of Heads (isHeads) and Tails (!isHeads).
 * 
 * Feel free to adapt this test driver for testing different classes
 * in your assignments. 
 * 
 * @author FIT1002 Unit Leaders
 * @version 1.00 2010/6/25
 */
public class CoinTestDriver
{
    public static void main(String[] args){
        System.out.println("Constructing two new Coins with randomised faces ...");
        // We expect the Coin constructor to randomise the initial face.
        Coin testCoin1 = new Coin();
        Coin testCoin2 = new Coin();
        
        // Output each die's face
        System.out.println("Expected face value: true or false");
        System.out.println("Actual result: " + testCoin1.getIsHeads());
        System.out.println("Expected face value: true or false");
        System.out.println("Actual result: " + testCoin2.getIsHeads());
        
        System.out.println();
        
        System.out.println("Tossing coins...");
        testCoin1.toss();
        testCoin2.toss();
        
        System.out.println("Expected face value: true or false");
        System.out.println("Actual result: " + testCoin1.getIsHeads());
        System.out.println("Expected face value: true or false");
        System.out.println("Actual result: " + testCoin2.getIsHeads());
        
        System.out.println();
        
        System.out.println("Tossing coins 50 times...");
        // These variables are used to keep count of heads and tails tosses.
        int coin1Heads = 0;
        int coin1Tails = 0;
        int coin2Heads = 0;
        int coin2Tails = 0;

        for(int counter = 0; counter < 50; counter++){
            testCoin1.toss();
            testCoin2.toss();
            if(testCoin1.getIsHeads()) 
                coin1Heads++;
            else
                coin1Tails++;
            if(testCoin2.getIsHeads()) 
                coin2Heads++;
            else
                coin2Tails++;
        }
        
        System.out.println("A fair coin will get roughly 25 heads, 25 tails.");
        System.out.println("Coin 1: " + coin1Heads + " heads, " + coin1Tails + " tails.");
        System.out.println("Coin 2: " + coin2Heads + " heads, " + coin2Tails + " tails.");
    }
}

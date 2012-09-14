/**
 * Die Test Driver
 * 
 * The Die Test Driver will instantiate a Die object and then repeats a series
 * of tests to ensure that it always reports a valid face value when rolled.
 * 
 * The test driver itself is pretty simple, because the Die only has a few
 * methods, none of which involve parameter passing.
 * 
 * Feel free to adapt this test driver for testing different classes
 * in your assignments. 
 * 
 * @author FIT1002 Unit Leaders
 * @version 1.00 2010/6/25
 */
public class DieTestDriver
{
    public static void main(String[] args){
        System.out.println("Constructing new Die with a randomised value ...");
        // We expect the Die constructor to randomise the initial value.
        Die testDie = new Die();
        // Display the value twice, to demonstrate unique rolls.
        System.out.println("Expected face value: 1..." + Die.MAX_VALUE);
        System.out.println("Actual result: " + testDie.getFaceValue());
        
        System.out.println();
        System.out.println("Re-rolling ...");
        testDie.roll();
        System.out.println("Expected face value: 1..." + Die.MAX_VALUE);
        System.out.println("Actual result: " + testDie.getFaceValue());
        
        System.out.println();
        System.out.println("Rolling die 6000 times ...");

        // These variables are used to keep count of valid and invalid rolls.
        int face1 = 0, face2 = 0, face3 = 0, face4 = 0, face5 = 0, face6 = 0, faceError = 0;
        int currentFace = 0;
        for(int counter = 0; counter < 6000; counter++){
            testDie.roll();
            currentFace = testDie.getFaceValue();

            switch (currentFace){
            case 1:
            	face1++; break;
            case 2:
            	face2++; break;
            case 3:
            	face3++; break;
            case 4:
            	face4++; break;
            case 5:
            	face5++; break;
            case 6:
            	face6++; break;
            default:
            	faceError++; break;
            }
        }

        System.out.println("A fair die will show each face about 1000 times");
        System.out.println("1: " + face1);
        System.out.println("2: " + face2);
        System.out.println("3: " + face3);
        System.out.println("4: " + face4);
        System.out.println("5: " + face5);
        System.out.println("6: " + face6);
        System.out.println("Error: " + faceError);
        
    }
}


import java.util.*;
public class Warehouse {
    private int size;
    private int noOfBins = 0 ;
    Bin[] bins;
    Scanner scan = new Scanner(System.in);
    public Warehouse (int initsize){
	bins = new Bin[initsize];
    }
    
    public boolean addBin(String addID,int addLevel, int addMin, int addMax, boolean addAuto){
    	boolean result = false ;
	if( noOfBins < bins.length){
	bins[noOfBins] = new Bin(addID,addLevel,addMin,addMax,addAuto);
	noOfBins++;
	result = true;
	}
	else {
	    return false;
	} 
	return result;  
    }

    public void replenish(int a){
	int quantityAdded;
	if (bins[a].getState() && bins[a].getStockLevel() <  bins[a].getStockMin()){ 
	    
	    bins[a].StockIn((bins[a].getStockMax() - bins[a].getStockLevel()));
	    System.out.println("Automatic Restock Undetaken.");
	}
	else {
	    System.out.print("Enter the amount to Replenish: ");
	    quantityAdded = scan.nextInt();
	    System.out.println("Amount Restocked : " + bins[a].StockIn(quantityAdded));
	}
	
    }
}
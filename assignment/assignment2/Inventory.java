public class Inventory {
    public static void main(String[] args){
	final int SIZE = 3;
	Warehouse warehouse1 = new Warehouse(SIZE);
	//Testing whether adding more than 3 bins will mess things up.
	System.out.println("Bins Beyond here should be added (it will print true.)");
	System.out.println("Result: " + warehouse1.addBin("1",60,50,100,false));
  	System.out.println("Result: " + warehouse1.addBin("2",40,50,100,true));
	System.out.println("Result: " + warehouse1.addBin("3",1,10,20,false));
	System.out.println("Bins Beyond here should not be added (it will print false.)");
	System.out.println("Result: " + warehouse1.addBin("4",1,110,120,false));
	System.out.println("Result: " + warehouse1.addBin("5",1,110,120,false));

	for(int i = 0 ; i < SIZE;i++){
	    System.out.println("[Current] " + warehouse1.bins[i].toString());
		/* Replenish The Bins */
 		warehouse1.replenish(i); 
		System.out.println("");
	}   	
	System.out.println("Newest Status of the Inventory");
	for(int i = 0 ; i < SIZE ;i++){	    
	    System.out.println("[Replenished] " + warehouse1.bins[i].toString());
	}   	
    }
}

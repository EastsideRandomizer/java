public class Bin{
    private String stockID;
    private int stockLevel;
    private int stockMax;
    private int stockMin;
    private boolean auto;
    public Bin(String initStockID, int initStockLevel, int initStockMin, int initStockMax, boolean initState){
	stockID = initStockID;
	stockLevel = initStockLevel;
	stockMax = initStockMax;
	stockMin = initStockMin;
	auto = initState;
    }

    public String getStockID(){
	String ret = stockID;
	return ret;
    }

    public int getStockLevel(){
	int ret = stockLevel;
	return ret;
    }

    public int getStockMax(){
	int ret = stockMax;
	return ret;
    }


    public boolean getState(){
	boolean ret = auto;
	return ret;
    }


    public int getStockMin(){
	int ret = stockMin;
	return ret;
    }

    public int StockIn(int quantity){
	int ret = 0;
	int iniLevel = stockLevel;
	if((stockLevel + quantity) > stockMax){
	    stockLevel += (stockMax - stockLevel);
	    ret = (stockMax-iniLevel);
	}
	else if (quantity > 0){
	    stockLevel = stockLevel + quantity;
	    ret = quantity;
	}
	return ret;
    }
    
    public String toString(){
	String state;
	if (stockMax == stockLevel){
	    state = "(FULL)";
	}
	else if ( stockLevel < stockMax && stockLevel > stockMin)  {
	    state = "(Below Max Level)";
	}
	else {
	    state = "(Below Min Level)";
	}
	return ("Stock ID: " + getStockID() +" Level: " + getStockLevel() + " Min: " + getStockMin() + " Max: " + getStockMax() + " Auto: " + getState() + " " + state ) ;
    }
}
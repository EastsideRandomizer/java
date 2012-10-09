
public class Food{
    private String name;
    private double servingSize;
    public Food(String initName, double initServingSize ){
	name = initName;
	servingSize = initServingSize;
    }

    public String getName(){
	String ret = name;
	return ret;
    } 
    
    public void setName(String newName){
	String nameset = newName;
	name = nameset;
    }
    
    public String getSize(){
	double ret = servingSize;
	return ret;
    } 

    public void setSize(double newServing){
	double set  = newServing;
	servingSize = set;
    }
    
    public String toString(){
	String ret = "Name of Food: " + name + " Serving Size(kg):" + servingSize;
	return ret;
    }
}


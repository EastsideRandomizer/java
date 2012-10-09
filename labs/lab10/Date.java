public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int initDay, int initMonth, int iniYear){
	day = initDay;
	month = initMonth;
	year = initYear;
    }
    
    public void setDate(int newDay, int newMonth, int newYear){
	day = newDay;
	month = newMonth;
	year = newYear;
    }	

    public int getDay(){
	int ret = day;
	return ret;
    }

    public int getMonth(){
	int ret = month;
	return ret;
    }

    public int getYear(){
	int ret = year;
	return ret;
    }

    public String toString(){
	String ret = "Day: " + day " ,Month: " + month " ,Year: " + year;
	return ret;
    }
}
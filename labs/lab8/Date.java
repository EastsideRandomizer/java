public class Date{
    private int day;
    private int month ;
    private int year;
    private boolean format;
    public Date() {
	getDay();
	getMonth();
	getYear();
    }
    
    public static int checkDate(int dayToCheck, int monthToCheck, int yearToCheck){
	if (dayToCheck <= 31 && dayToCheck > 0 && monthToCheck <= 12 && monthToCheck > 0 && yearToCheck > 0){
	    return 1;
	}
	else {
	    return 0;
	}
    }
    public void resetDate(int dayToReplace, int monthToReplace, int yearToReplace){
	if (checkDate(dayToReplace, monthToReplace, yearToReplace) == 1){
	    day = dayToReplace;
	    month = monthToReplace;
	    year = yearToReplace;
	    format = true ;
	    
	}
	else {
	    System.out.println("Not doing anything. Incorrect Date Format");
	}
    }

    public int getDay(){
	return day;
    }
    public int getMonth(){
	return month;
    }
    public int getYear(){
	return year;
    }

    public String toString(){
	if (format == true){
	    return "Day " + day + " of Month " + month + " year " + year;
	}
	else {
	    return "Format Error";
	}
    } 
}


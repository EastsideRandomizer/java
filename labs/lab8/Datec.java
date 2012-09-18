public class Date{
    public int day;
    public int month ;
    public int year;
    public Date() {
	getDay();
	getMonth();
	getYear();
    }
    
    public static int checkDate(Date dateToCheck){
	if (dateToCheck.day <= 31 && dateToCheck.day > 0 && dateToCheck.month <= 12 && dateToCheck.month > 0 && dateToCheck.year > 0){
	    return 1;
	}
	else {
	    return 0;
	}
    }

    public void resetDate(Date dateToReplace){
	if (checkDate(dateToReplace) == 1){
	day = dateToReplace.day;
	month = dateToReplace.month;
	year = dateToReplace.year;	
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

    public String toString(Date dateToReplace){
	if (checkDate(dateToReplace) == 1){
	    return "Day " + day + " of Month " + month + " year " + year;
	}
	else {
	    return "Format Error";
	}
    } 
}


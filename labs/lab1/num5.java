public class num5 {
    public static void main (String[] args) {
	/*declares variables*/
	int hour = 1;
	int minute = 28;
	int seconds= 42;
	int output;
	/* print some values */
	System.out.println("Hours:" +hour);
	System.out.println("Minutes:" +minute);
	System.out.println("seconds:" +seconds);
	/* calculate the number of seoncds */ 
	output = hour *3600 +  minute * 60 + seconds;
	/* prints the number of seconds */
	System.out.println("The number of seconds is:" +output);
    }
}

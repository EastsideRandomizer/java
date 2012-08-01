public class num4 {
    public static void main (String[] args) {
	/*declares variables*/
	int hour = 1;
	int minute = 28;
	int seconds= 42;
	int output;
	/* print some values */
	System.out.println("Hours:" +hour);
	System.out.println("Minutes:" +minutes);
	System.out.println("seconds:" +seconds);
	/* calculate the number of seoncds */ 
	output = hour *3600 +  minutes * 60 + seconds * 60;
	/* prints the number of seconds */
	System.out.println("The number of seconds is:" +output);
    }
}

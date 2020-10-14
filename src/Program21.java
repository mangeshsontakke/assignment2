import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/*21. Find the number of days between two input dates.
 *///what typeof exception 

class Program21 {

	public static void main(String[] args) {
			
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		
		String inputString1 = "23 01 1997";// given input
		
		String inputString2 = "05 09 2020";// given input

		try {
		    Date date1 = myFormat.parse(inputString1);// convert string to date
		    Date date2 = myFormat.parse(inputString2);// convert string to date
		    long diff = date2.getTime() - date1.getTime();// calculate date 
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));// print output
		   
		} catch (ParseException e) {
		    e.printStackTrace();// print exceptions
		}
	}
}

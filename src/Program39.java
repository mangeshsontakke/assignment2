
import java.time.LocalDate;
import java.time.Period;

public class Program39 {
	
	//39.months between two dates
	
		public static void main(String[] args){

	        LocalDate fromdate = LocalDate.of(2012,12,01);		
			LocalDate todate = LocalDate.of(2012,01,01); 
			
	        Period diff = Period.between(todate,fromdate);//Period is interface(java API's)
	        
			System.out.println(diff.getYears()+"Year & "+diff.getMonths()+" Month\n");
		}
	}



import java.util.StringTokenizer;

public class Program34 {

	//34.Return the number of days in a month, 
		//where month and year are given as input.	
		
		public static void main(String[] args) {
		
		String str = "02/2004";
		StringTokenizer st = new StringTokenizer(str,"/");// split it into parts before '/' or after '/'
		int month = Integer.parseInt(st.nextToken());// before '/' count as a month as a integer
		int yr = Integer.parseInt(st.nextToken()); // after '/' count as a year as a integer
		
		if(month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12)
		{
			System.out.println(31);
		}else if(month==4 ||month==6 ||month==9 ||month==11)
		{
			System.out.println(30);
		}else if(month==02){
			if(yr%4==0)// if it is leap year then days become 29 else days is 28 
			{
				System.out.println(29);
			}else{
				System.out.println(28);
			}
			
		}
		}

}

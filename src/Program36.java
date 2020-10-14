import java.util.HashMap;
import java.util.Map;

public class Program36 {

		//36. Input a hashmap.Count the keys which are not divisible by 4 and return.
		public static void main(String[] args) {
		
			HashMap<Integer,String> hm = new HashMap<Integer,String>();
			
			hm.put(88, "Mangesh");
			hm.put(20, "Minakshi");
			hm.put(44, "Sonakshi");
			hm.put(44, "Arpita");
			hm.put(66, "Shivani");
						
			int counter = 0;
			for(Map.Entry entry : hm.entrySet())
			{
				int count = (int) entry.getKey();// fetch the keys
				if(count % 4 !=0)// not divisible by 4
				{
					counter++;
				}
			}
			System.out.println(counter);

	}

}


/*27. find the three consecutive characters in a string. if the string consists any three 
consecutive characters return 1 else return -1
like AAAxyzaaa will return true.*/
//print position
public class Program27 {

	public static void main(String[] args) {
		
		String con="AAAxyzaaa";
		String str = "Mangesh ramesh Abhi xyz AAAxyzaaa xxdf";
				
		int temp = 0;
		
		for (int i=0;i<str.length();i++)
		{
			if(str.contains(con))
			{
				temp = 1;
			}
			else
			{
				temp = -1;
			}
		}System.out.println(temp);
	
}
}

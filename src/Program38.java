
public class Program38 {
	
	/*38.input:
	Search string s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   	output:Return 1 if s2 comes before s3 in searchstring else return 2  */
	
	public static void main(String[] args) {
	
		String str1="GeniusDevRajkumar";
		int index1=str1.indexOf("Raj");// focus on "Raj"
		int index2=str1.indexOf("Dev"); // focus on "Dev"
		
			if(index1<index2)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");	
			}
		
	}

}

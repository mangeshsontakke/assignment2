
public class Program37 {

	/*(37).compare two strings,if the characters in string 1 are present in
	   string 2, then it should be put as such in output, else '+' should be
	   put in output...ignore case difference.

		input 1:"New York"
		input 2:"NWYR"

		output:N+w+Y+r+
	 */
		public static void main(String[] args) {
		
			String str1 = "New York";
			String str2 = "NWYR";
			StringBuffer ans = new StringBuffer();
			String str3 = str1.toUpperCase();
			
			for(int i=0;i<str2.length();i++)//NWYR
			{
				for(int j=0;j<str3.length();j++)//New York
				{
					if(str2.charAt(i)==str3.charAt(j))
					{
						ans.append(str1.charAt(j)).append('+');
					}
				}
			}
			System.out.println(ans);
	}

}

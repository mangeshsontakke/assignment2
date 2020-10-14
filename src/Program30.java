import java.util.StringTokenizer;

public class Program30 {

	/*30. GIVEN A STRING 555-666-1234
	DISPLAY AS 55-56-661-234? */
// for loop
		public static void main(String[] args) {
		String str="555-666-1234";
		
		String[] res = new String[str.length()];
		for (int i = 0; i < str.length(); i++)
		    res[i] = Character.toString(str.charAt(i));
		
			System.out.print(res[0]+res[1]+"-");
			System.out.print(res[2]+res[4]+"-");
			System.out.print(res[5]+res[6]+res[8]+"-");
			System.out.print(res[9]+res[10]+res[11]+"?");
			
		
		
		
		
		/*StringTokenizer st = new StringTokenizer(str,"-");// st pointing to str for tokens
		String s1 = st.nextToken();//555
		String s2 = st.nextToken();//666
		String s3 = st.nextToken();//1234
	 	StringBuffer sb = new StringBuffer();// use for sub part according to program output
		sb.append(s1.substring(0, s1.length()-1)).append('-');//55-
		sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');//56-
		sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');//661-
		sb.append(s3.substring(1, s3.length())).append('?');//234?
		//System.out.println(sb.toString());
		
		for(int i=0;i<1;i++)
		{
		System.out.println(sb);
		}
		*/
		
		

	}



}

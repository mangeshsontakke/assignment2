public class Program40 {
	
	/*40.  intput="xyzwabcd"
	intput2=2;
	input3=4;
	output=bawz
	for loop
*/
		public static void main(String[] args) {
		
			String str = "xyzwabcd";

			StringBuilder sb = new StringBuilder();
			int input2=2,input3=4;
				for(int i=str.length()-1;i>=0;i--)
				{
					sb.append(str.charAt(i));	
				
				}
			System.out.print(sb.substring(input2,input2+input3));
			
			
			/*char s1 = 0;
			int input2 = 2, input3 = 4;
			StringBuilder sb = new StringBuilder(str1);// for reverse order we use StringBuilder
		
			for(int i=str1.length()-1;i>=0;i--){
				 s1=str1.charAt(i);
				System.out.print(s1);
			
			}
			
			String s2 = sb.substring(input2, input2+input3);//2,6(2+4)  
			StringBuilder sb1 = new StringBuilder(s2);
			sb1.reverse();
			System.out.println("  "+"Output- "+s2);*/
		
		}
	
	}



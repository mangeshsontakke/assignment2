
public class Program32 {

	/*32. input1=commitment;
	  output=cmmitmnt;
	c be the first index position 
	remove even vowels from the string
	 */
		
		public static void main(String[] args) {
			 String s1="mangesh";
	         StringBuffer sb1=new StringBuffer();
	for(int i=0;i<s1.length();i++)
	     if((i%2)==0)
	     sb1.append(s1.charAt(i));
	     else if((i%2)!=0)
	       if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' 
	       && s1.charAt(i)!='o' && s1.charAt(i)!='u')
	      
	    sb1.append(s1.charAt(i));
	System.out.println(sb1);
          
	}

}

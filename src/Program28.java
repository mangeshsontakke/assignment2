import java.util.Scanner;

public class Program28 {

	/*28.String encrption. replace the odd-index character with 
	 next character(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
	   leave the even index as such. return the encrypted string.*/

		public static void main(String[] args) {
			String str;
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String: ");	
			str = sc.next();
			char[] word = str.toCharArray();// convert string into array format
			
				for(int i = 0; i < word.length; i++)
				{
					if(i%2!=0) // odd index check
						word[i]++;
					
						System.out.print(" "+word[i]);
				}
			
		}		

	}


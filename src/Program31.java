import java.util.Scanner;

public class Program31 {

	/*31. input1="Rajasthan";
	input2=2;
	input3=5;
	output=hts;
 */
	public static void main(String[] args) {
/*	String str;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Input1 String: ");
	str = sc.next();
	int input2;
	int input3;
	StringBuffer ans = new StringBuffer();
	StringBuffer s = new StringBuffer(str);
	ans =s.reverse();// traverse from ending as per program requirement
	System.out.println("StringBuffered: "+ans);
	System.out.println("Input2: ");
	input2=sc.nextInt();
	
	System.out.println("Input3: ");
	input3=sc.nextInt();
	System.out.println("OutPut: "+ans.substring(input2,input3));//start,end-1
*/	
	
	
	String str="Maharshtra";
	StringBuilder sb = new StringBuilder();
	int input2=2,input3=5;
		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));	
		
		}
	System.out.print(sb.substring(input2,input3));
	}

}

import java.util.Scanner;

public class Program35 {

	//output
	/*35.Retrieve the elements in a array, which is an input, 
	 *which are greater than a specific input number. 
	 * Add them and find the reverse of the sum.
	 */

		public static void main(String[] args) {
			
			int[] num={54,32,67,85,34,59,25,13,97,36};
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter an Integer:");
		    int input=sc.nextInt();
			int sum=0;
			for(int i=0;i<num.length;i++)
				if(num[i]>input)
					sum=sum+num[i];
			System.out.println("Total the numbers greater then n:  "+sum);
			

	}

}

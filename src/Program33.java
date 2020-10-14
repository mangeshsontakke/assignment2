
public class Program33 {


	//33.Retrieve the odd-position digits from input integer array. 
	//Multiply them with their index and return their sum.

	public static void main(String[] args) {
	

		int[] arr = {9,8,6,4,3,4,6,5};//1,3,5,7, = 8*1+4*3+4*5+5*7 = 75
		 
		int sum = 0 ;
		
		for (int i=0; i<=arr.length-1;i++)
		{
			if(i%2!=0)// for finding odd position
				
			sum = sum + arr[i] * i; // 8*1 + 4*3 + 4*5 + 5*7 = 75
		}
			System.out.println(sum);
	}

}

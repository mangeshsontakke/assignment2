import java.util.Arrays;

public class Program25 {
	
	//25. find the average of the maximum and minimum number in an integer array
	
	public static void main(String[] args) {
		
		  int[] a = {10,54,23,14,32,45};
		  Arrays.sort(a);// using for Sorting Ascending order
	      int b = a[0];//first position = 10
	      int c = a[a.length-1];//last position = 54
		  int avg=(b+c)/2;
	      System.out.println(avg);
	}

}

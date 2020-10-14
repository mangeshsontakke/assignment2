import java.util.Scanner;
import java.util.StringTokenizer;

/*26. validate the ip address in the form a.b.c.d
   where a,b,c,d must be between 0and 255
   if validated return 1 else return 2*/


public class Program26 {
			
	public static void main(String[] args) {
	
		String ipAddress="10.10.150.255";
        StringTokenizer t=new StringTokenizer(ipAddress,".");//Delimiter = .
        
        int a=Integer.parseInt(t.nextToken());
        int b=Integer.parseInt(t.nextToken());
        int c=Integer.parseInt(t.nextToken());
        int d=Integer.parseInt(t.nextToken());
       
        
      if((a>=0 && a<=255)&&(b>=0 && b<=255)&&(c>=0 && c<=255)&&(d>=0 && d<=255))
      {
        System.out.println("valid ipAddress");
      }
      else
      { 
        System.out.println("not a valid ipAddress");
      }
	}

}

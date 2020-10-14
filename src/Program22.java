import java.util.StringTokenizer;

public class Program22 {

/*	22. Enter yout name and return a string "print the title first 
 and then comma and then first letter of initial name.*/
	//for loop 

	public static void main(String[] args) {
		
	/*String s1 = "Mangesh Sontakke";
    StringTokenizer t = new StringTokenizer(s1," ");// StringTokenizer is used for split the string into single token
    String s2 = t.nextToken();//Mangesh
    String s3 = t.nextToken();//Sontakke
    StringBuffer sb = new StringBuffer(s2);//Mangesh pointing to s2
    StringBuffer sb1=sb.append(',').append(s3.charAt(0));// concat Mangesh,S
    System.out.println((sb1));*/
    
    
  /*  String str = "Mangesh Sontakke";
    String words[] = str.split(" ");
    System.out.println(words[0]+"," + words[1].charAt(0));*/
    
    String str = "Mangesh Sontakke";
	String[] res = new String[str.length()];
	for (int i = 0; i < str.length(); i++)
	    res[i] = Character.toString(str.charAt(i));
	
		System.out.print(res[0]+res[1]+res[2]+res[3]+res[4]+res[5]+res[6]+","+res[8]);
    
    
	}
    

}



import java.util.LinkedHashSet;

/*23.Write a Program that accepts a string and removes the duplicate characters.
 *///simple loop for

public class Program23 {

	  public static void main(String[] args){
		String s1 = "Mangeshhjsss";
		
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();// used for avoiding duplicate char
        
		 for(int i=0;i<s1.length();i++)
		 {
		lhs.add(s1.charAt(i)); //adding only without duplicate character
			 //for each loop
		 }
		 
		 for(Character ch : lhs)// loop will execute till lhs is empty 
			 System.out.print(ch);
		
	
	}

}

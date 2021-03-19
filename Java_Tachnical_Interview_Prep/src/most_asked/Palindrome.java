package most_asked;

public class Palindrome {
	public static void main(String[] args) {
		// What is the palidnreome?
		// if the String is equal after reversed
		// EX: Level --> Level => True
		// Game ---> emaG => false
          
	   System.out.println(isPalindrome("game"));	
	}
	
	  
	public static boolean isPalindrome(String str) {
		//reverse str first
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev+=""+str.charAt(i);
		}
		
    return str.equals(rev);
	}
	
}

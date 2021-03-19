package most_asked;

public class ReverseInt {
	public static void main(String[] args) {
    //reverse an integer 
     //EX: 123  -- 321
		
 	 
	int num=123;
	String sValue=String.valueOf(num);
	String rev="";
	for(int i=sValue.length()-1;i>=0;i--) {
		rev+=sValue.charAt(i);
	}
	int revInt=Integer.parseInt(rev);  
	System.out.println(revInt);  
	  
		
	}
}

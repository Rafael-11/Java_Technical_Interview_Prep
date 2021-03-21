package most_asked;

public class SumOfDigits {
  public static void main(String[] args) {
	    //Write a method to sum given digits 
	    //EX: int = 1234 ==> sum=10
	    
	    System.out.println(sumDigits(1234));
	  
    }
     public static int sumDigits(int num) {
    	 int sum=0;
    	  
    	 while(num>0) {
    		 sum=sum+num%10;
    		 num=num/10;
    	 }
    	
    	 
    	 return sum;
     }
}

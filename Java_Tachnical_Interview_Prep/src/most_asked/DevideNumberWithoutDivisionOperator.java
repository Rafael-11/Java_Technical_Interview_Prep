package most_asked;



public class DevideNumberWithoutDivisionOperator {
	public static void main(String[] args) {
         
		System.out.println(division(10, 5));
		
	}
	                             
	public static String division(int divident, int divisor) {
		    int quotient=0;
		    int remainder=0;
		     
		    while(divident>=divisor) {
		      // if 10 >=5 which is true  <1st iteration>
		    	//divident value is 5 now  
		     //  if 5 >=5 which is true     <2nd iteration>
		    	////divident value is 0 now 
		    	//if 0 >=5 which is false    <3rd iteration>
		    	//exist the loop
		    	divident=divident-divisor; 
		     //  divident=10-5;	//5 
		    	quotient++; //1 //2  
		    	remainder=divident; //5 //0
		    		
		    }
		    	
		
		return "quotient = "+ quotient+ " \nremainder = "+ remainder;
	}
}

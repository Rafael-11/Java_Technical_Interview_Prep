package most_asked;

import java.util.*;



public class FindLargestValueInArrays {
  public static void main(String[] args) {
	//Find the largset number in the array
	  
	int[] arr= {5,8,2,9,10,6};
	//first sport by ascending order 
	Arrays.sort(arr);
	System.out.println(arr[arr.length-1]);// it will return last index digit 
	                                    //which is largest value after sorted
	
	
	//Collection test
	Integer arr2[]= {5,8,2,9,10,6,90};
	System.out.println(findLargestArray(arr2, arr2.length));
	
  }
  
   //Collection solution 
   public static int findLargestArray(Integer[] a,int lengthOfArray) {
    List<Integer> ls=Arrays.asList(a);
    Collections.sort(ls);
    int largest=ls.get(lengthOfArray-1);

	   return largest;
	   
   }
  
}

package most_asked;

public class BinarySearch {
    //Binary search is faster than Linear search!
	//It finds the position of the target value within a sorted array. Binary search 
	//compares the target value to the middle element of the array.
	//If it is match then return true, if not you divide it again until you reach the target value 
	
  	
	public static void main(String[] args) {
		  int[] arr1= {20,10,50,40,12,9};
		  int target=12;
		  int last=arr1.length-1;
		//binearySearch(arr1, 0, last, target);
	}
	
	/*public static void binearySearch(int[] array,int first, int last,int target) {
		int mid=(first+last)/2; //will return the middle position
		while(first<=last) {
			if(array[mid] < target) {
				first=mid+1;
			}else if(array[mid]==target) {
				System.out.println("Target element is found at index: "+ mid);
				break; //once it found loop should break and exist! 
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element is not found!");
			
		}
		
		
		
		
	} */
	
	public static void binarySearch(int arr[], int first, int last, int key){
		int mid = (first + last)/2;
		while( first <= last ){
			if ( arr[mid] < key ){
			first = mid + 1;
			}else if ( arr[mid] == key ){
			System.out.println("Element is found at index: "
			+ mid);
			        break;
			     }else{
			        last = mid - 1;
			     }
			     mid = (first + last)/2;
			}
			if (
			first > last ){
			System.out.println("Element is not found!");
	}
	
	}
}

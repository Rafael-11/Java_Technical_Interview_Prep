package most_asked;

public class SwipingTwoValues {
  public static void main(String[] args) {
	
	//without temp var;
	int a=10,b=20;
	a=a+b;//30
	b=a-b;//10
	a=a-b;//20
	System.out.println(a+":"+b);
	//with temp var 
	int x=10,y=20,temp;
	
	temp=x;
	x=y;
	y=temp;
	System.out.println(x+":"+y);
	
	
	
	
	
	  
	  
}
}

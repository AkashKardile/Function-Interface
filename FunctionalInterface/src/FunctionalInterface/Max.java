package FunctionalInterface;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxFinder add=(a,b)->a+b;
		
		int Addition=add.max(30, 20);
		
		System.out.println("Addition is: "+Addition);
		
		
		MaxFinder sub=(a,b)->a-b;
		
		int subtraction=sub.max(30,20);
		System.out.println("Subtraction is: "+subtraction);
		
		
		MaxFinder m= (a,b)->
		{
			System.out.println("Hey Lambda this is new to me...");
			int res=a*b;
			return res;
		};
		
		int multiply=m.max(Addition, subtraction);
		System.out.println("Multiplication : "+multiply);
		
		
		MaxFinder d=(a,b)->
		{
			System.out.println("This is my division");
			
			int div=a/b;
			return div;
		};
		
		int division=d.max(Addition, subtraction);
		System.out.println("Division is: "+division);
		
		
		
		}
	
	
		

}

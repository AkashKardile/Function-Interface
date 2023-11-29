package FunctionalInterface;

public class Min {
	
	public static void Addition(Minimum m)
	{
		System.out.println("Addition: ");
		
		int a=m.min(30, 20);
		System.out.println(a);
		System.out.println(" ");
	}
	
	public static void subtraction(Minimum m)
	{
		System.out.println("Subtrcation: ");
		int s=m.min(30, 20);
		System.out.println(s);
		System.out.println(" ");
	}
	
	
	public static void Multiplication(MaxFinder m)
	{
		System.out.println("Multiplication");
		int mul=m.max(30, 20);
		System.out.println(mul);
	}
	
	
	public static void greeting(Hello h)
	{
		h.welcome();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition((a,b)->{System.out.println("Hey your Addition details are : "); return a+b;});
		subtraction((a,b)->{System.out.println("Hey your subtraction details are: ");return a-b;});
		Multiplication((a,b)->{System.out.println("Your Multiplication details are: ");return a*b;});
		greeting(()->{System.out.println("Hello Akash How are you");});	
	
	}
}

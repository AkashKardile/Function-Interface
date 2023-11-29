package FunctionalInterface;

public class Allopeartion {
	
	public static void Addition(Format f)
	{
		int add=f.opeartion(20, 30);
		System.out.println(add);
	}
	
	public static void Subtraction(Format f)
	{
		int sub=f.opeartion(10, 30);
		System.out.println(sub);
	}
	
	
	public static void Display(Information i)
	{
		i.info();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition((a,b)->{System.out.print("Your addition is:"); return a+b;});
		Subtraction((a,b)->a-b);
		
		Display(()->System.out.println("This is my content"));

	}

}

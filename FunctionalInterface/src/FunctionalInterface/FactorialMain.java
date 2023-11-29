package FunctionalInterface;

public class FactorialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f=(b)->b*b;
		
		int a=f.fact(20);
		
		System.out.println("Factorial is: "+a);
		
		
		
		Factorial f1=(b)->b;
		
		int c=f1.fact(30);
		System.out.println(c);
		

	}

}

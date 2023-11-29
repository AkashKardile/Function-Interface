package FunctionalInterface;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s=(a,b)->a+b;
		
		int add=s.operations(20,30);
		System.out.println(add);
		
		
		Sum s1=(a,b)->a-b;
		int sub=s1.operations(20, 10);
		System.out.println(sub);
		
		
		Sum s2=(a,b)->
		{
			int res=a*b;
			return res;
		};
		
		int mul=s2.operations(add, sub);
		System.out.println(mul);
		
		

	}

}

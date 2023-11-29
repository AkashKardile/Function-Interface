package Function;

import java.util.function.Function;

public class MyFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer, Integer> i=(n)->n*n;
		
		System.out.println(i.apply(20));
		
		Function<String , Character> s=(str)->str.charAt(3);
		System.out.println(s.apply("Akash"));
		
		Function<Integer, String> f=(n)->n>0?"Yes":"No";
		
		System.out.println(f.apply(-20));
	}

}

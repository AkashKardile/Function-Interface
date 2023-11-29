package BiFunction;

import java.util.function.BiFunction;

public class MyBiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, String> g=(a,b)->a>b?"a is greater":"b is greater";
		System.out.println(g.apply(20,30));

	}

}

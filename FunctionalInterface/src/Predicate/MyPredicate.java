package Predicate;

import java.util.function.Predicate;

public class MyPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p=(n)->n>0;
		System.out.println(p.test(-20));
	}

}

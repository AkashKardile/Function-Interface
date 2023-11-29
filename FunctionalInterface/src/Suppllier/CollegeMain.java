package Suppllier;

import java.util.function.Supplier;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<College> s=()->new College(101,"KKWAGH","Nashik");
		System.out.println(s.get());

	}

}

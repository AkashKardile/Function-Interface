package Predicate;

import java.util.function.Predicate;

public class EvenNumber {
	
	public static void countEvenNumber(int x[],Predicate<Integer> p)
	{
		int cnt=0;
		for(int i=0;i<x.length;i++)
		{
			if(p.test(x[i]))
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {1,2,3,4,5,6,7,8,9,10,12};
		
		Predicate<Integer > p=(n)->(n%2)==0;
		
		countEvenNumber(x, p);

	}

}

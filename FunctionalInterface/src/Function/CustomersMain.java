package Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import Consumer.Customer;

public class CustomersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Customers> clist=new ArrayList<>();
		Customers c[]=new Customers[3];
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the id of customer");
			int cid=sc.nextInt();
			
			System.out.println("Enter the name of customer: ");
			String name=sc.next();
			
			System.out.println("Enter the city of customer: ");
			String city=sc.next();
			
			c[i]=new Customers(cid,name,city);
			//clist.add(c);

		}
		
		List<Customers> clist=Arrays.asList(c);
		
		Function<Customers, String> f=(c1)->c1.getCity().equals("Pune")?"Best City":"Avg city";
		
		for(Customers ct:clist)
		{
		String grade=f.apply(ct);
		System.out.println(ct+"  "+grade);
		
		}
		

	}

}

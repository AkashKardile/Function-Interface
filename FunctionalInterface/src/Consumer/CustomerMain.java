package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Consumer<String> s=(str)->System.out.println(str);
//		
//		s.accept("Akash");
//		
//		
//		Consumer<Customer> cust=(c)->System.out.println(c.getcId()+" "+c.getCity()+" "+c.getcName());
//		
//		Customer ct=new Customer(1,"Akash","Niphad");
//		
//		Customer ct1=new Customer(2,"Shubham","Pune");
//		
//		
//		cust.accept(ct);
//		cust.accept(ct1);
//		
//		
//		Consumer<Integer> i=(n)->System.out.println(n);
//		
//		i.accept(20);
		
		List<Customer> clist=new ArrayList<>();
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the id of customer");
			int cid=sc.nextInt();
			
			System.out.println("Enter the name of customer: ");
			String name=sc.next();
			
			System.out.println("Enter the city of customer: ");
			String city=sc.next();
			
			Customer c=new Customer(cid,name,city);
			clist.add(c);
			
		}
		
		Consumer<Customer> cust=(ct)->System.out.println(ct.getcId()+" "+ct.getCity()+" "+ct.getcName());
		
		for(Customer ct:clist)
		cust.accept(ct);
	}

}

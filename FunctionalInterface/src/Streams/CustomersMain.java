package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer(4,"Akash","Nashik");
		Customer c2=new Customer(2,"Shubham","Nashik");
		Customer c3=new Customer(3,"Swati","Pune");
		Customer c4=new Customer(4,"Rohan","Nashik");
		Customer c5=new Customer(4,"Roshan","Pune");
		
		
		Customer cust[]= {c1,c2,c3,c4,c5};
		
		List<Customer> clist=Arrays.asList(cust);
		
		Stream<Customer> s=clist.stream();
		
		
		// FOREACH
		//s.forEach((c)->System.out.println(c));
		
		//Filter
		
//		Stream<Customer> slist=s.filter((c)->c.getCity().equals("Pune"));
//		slist.forEach((c)->System.out.println(c));
//		
		
//		Stream<Customer> mId=s.filter((c)->(c.getcId()==4));
//		mId.forEach((c)->System.out.println(c));
		
		
		//Sorted
//		Comparator<Customer> cu=(a,b)->a.getcId()-b.getcId();
//		s.sorted(cu).forEach((c)->System.out.println(c));
		
		
		//Map
		
//		Stream<String> city=s.map((c)->c.getCity());
//		city.forEach((d)->System.out.print(d+" "));
		
//		Stream<Customer> city=s.filter((c)->c.getCity().equals("Pune"));
//		Stream<String> name=city.map((c)->c.getcName());
//		name.forEach((d)->System.out.println(d));
//		
		
		//Collect
		
//		List<Customer> list=s.collect(Collectors.toList());
//		
//		for(Customer ci:list)
//		{
//			System.out.println(ci);
//		}
		
		
		s.map((c)->c.getCity()).collect(Collectors.toList()).forEach((c)->System.out.println(c));
	}

}

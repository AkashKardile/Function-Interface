package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e[]=new Employee[3];
		
		e[0]=new Employee(1,"Aaksh","Support Engineer: ");
		e[1]=new Employee(2,"Shubham","Developer");
		e[2]=new Employee(3,"Akash","Manager");
		
		List<Employee> elist=Arrays.asList(e);
		
		Stream<Employee> s=elist.stream();
		
		//s.forEach((c)->System.out.println(c));
		
//		Stream<Employee> slist=s.filter((c)->(c.geteId()==3));
//		slist.forEach((d)->System.out.println(d));
		
//		Stream<Employee> slist=s.filter((c)->(c.geteName().equals("Aaksh")));
//		slist.forEach((d)->System.out.println(d));
//		
//		Stream<Employee> slist=s.filter((c)->(c.geteId()>=0));
//		slist.forEach((d)->System.out.println(d));
		
		
//		Comparator<Employee> emp=(a,b)->a.geteName().compareTo(b.geteName());
//		s.sorted(emp).forEach((c)->System.out.println(c));
		
//		Stream<String> eName=s.map((c)->c.geteName());
//		eName.forEach((c)->System.out.println(c));
		
//		List<Employee> l=s.collect(Collectors.toList());
//		for(Employee emp:l)
//		{
//			System.out.println(emp);
//		}
		
		
		List<Integer> l=s.map((c)->c.geteId()).collect(Collectors.toList());
		for(Integer i:l)
		{
			System.out.println(i);
		}
		
		
		

	}

}

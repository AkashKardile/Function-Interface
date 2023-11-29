package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College c[]=new College[5];
		
		c[0]=new College(105,"KKWAGH","Nashik");
		c[1]=new College(102,"NDMVP","Pune");
		c[2]=new College(103,"Gokhale","Nashik");
		c[3]=new College(104,"MET","Nashik");
		c[4]=new College(105,"PCCOE","Pune");
		
		List<College> l=Arrays.asList(c);
		
		Stream<College> s=l.stream();
		
//		s.forEach((c1)->System.out.println(c1));
		
//		s.filter((p)->p.getCity().equals("Pune")).forEach((p1)->System.out.println(p1));
		
		
//		Comparator<College> cu=(a,b)->a.getCid()-b.getCid();
//		s.sorted(cu).forEach((p1)->System.out.println(p1));
		
//		Stream<String> str=s.map((c3)->c3.getCity());
//		str.forEach((r)->System.out.println(r));
		
//		s.filter((p)->p.getCity().equals("Nashik")).map((c4)->c4.getCity()).forEach((f)->System.out.println(f));
//		
		
//		List<College> clist=s.collect(Collectors.toList());
//		
//		for(College c4:clist)
//		{
//			System.out.println(c4);
//		}
		
		//s.map((c4)->c4.getCity()).collect(Collectors.toList()).forEach((f)->System.out.println(f));
		
		Map<String, List<College>> m=s.collect(Collectors.groupingBy((e)->e.getCity()));
		
		for(Map.Entry<String , List<College>> mp:m.entrySet())
		{
			String str=mp.getKey();
			List<College> l1=mp.getValue();
			
			System.out.println("*******************");
			for(College l2:l1)
			{
				
				System.out.println(l2+" "+l1.size()+" "+str);
			}
		}
	}

}

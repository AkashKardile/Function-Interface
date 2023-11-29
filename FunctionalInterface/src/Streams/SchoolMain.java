package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School e[]=new School[3];
		
		e[0]=new School(1,"Akash","Support Engineer: ");
		e[1]=new School(2,"Shubham","Developer");
		e[2]=new School(3,"Akash","Manager");
		
		List<School> slist=Arrays.asList(e);
		
		Stream<School> s=slist.stream();
		
		//s.filter((c)->(c.getsId()>2)).forEach((d)->System.out.println(d));
		
		
//	 s.filter((c)->c.getsName().equals("Akash")).forEach((d)->System.out.println(d));
		
//		Comparator<School> ch=(a,b)->a.getCity().compareTo(b.getCity());
//		s.sorted(ch).forEach((d)->System.out.println(d));
		
		
//		Stream<Integer> myId=s.map((c)->c.getsId());
//		
//		myId.forEach((c)->System.out.println(c));
		
		
	//s.filter((c)->(c.getsId()>=2)).map((c)->c.getsName()).forEach((c)->System.out.println(c));
		
		List<String> l=s.map((c)->c.getsName()).collect(Collectors.toList());
		
		for(String l1:l)
		{
			System.out.println(l1);
		}
	}

}

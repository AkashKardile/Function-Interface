package Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e[]=new Employee[3];
		
		for(int i=0;i<3;i++)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the id of employee");
			int id=sc.nextInt();
			
			System.out.println("Enter the name of employee");
			String name=sc.next();
			
			System.out.println("Enter the city of employee: ");
			String city=sc.next();
			
			e[i]=new Employee(id,name,city);
		}
		
		List<Employee> elist=Arrays.asList(e);
		
		Predicate<Integer> p=(n)->n>5;
		
		for(Employee emp:elist)
		{
			if(p.test(emp.geteId())==true)
			{
				System.out.println(emp+" "+"eligible for coupon");
			}
			else
			{
				System.out.println(emp+" "+"not eligible for coupon");
			}
		}

	}

}

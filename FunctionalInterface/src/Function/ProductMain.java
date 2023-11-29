package Function;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p[]=new Product[3];
		p[0]=new Product(101,"Table",99);
		p[1]=new Product(102,"Chair",345);
		p[2]=new Product(103,"Shirt",567);
		
		List<Product> l=Arrays.asList(p);
		
		Function<Product, String> f=(p1)->p1.getPrice()>100?"AVG":"High";
		
		for(Product plist:l)
		{
			String str=f.apply(plist);
			System.out.println(str);
		}
	}

}

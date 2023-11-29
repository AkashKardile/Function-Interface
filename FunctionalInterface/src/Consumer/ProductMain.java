package Consumer;

import java.util.function.Consumer;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Consumer<String> s=(str)->System.out.println(str);
//		s.accept("Akash");
		
		Consumer<Product> p=(p1)->System.out.println(" "+p1.getPname()+" "+p1.getPrice());
		Product p2=new Product(101,"Table",123);
		p.accept(p2);

	}

}

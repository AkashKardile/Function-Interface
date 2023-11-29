package FunctionalInterface;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h=()->{
			System.out.println("This is my display method");
			System.out.println("Hey Akash how are you: ");
			
		};
		
		h.welcome();

	}

}

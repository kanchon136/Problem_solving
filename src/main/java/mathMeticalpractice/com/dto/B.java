package mathMeticalpractice.com.dto;

public class B {
	int x = 10;
	
	
public static void main(String []arg) {
	B b1 = new B();
	System.out.println("b1  "+b1.x);
	
	B b2 = b1;
	
	System.out.println("b2   "+b2.x);
	
	B b3 = new B();
	
	b3.x=100;
	b2.x=50;
	System.out.println(b1.x);
	
}
	
}
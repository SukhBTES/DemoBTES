package Assgn;

public class B extends A{
	
	public void p(double i)
	{
		System.out.println(i);
		
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub
		B b=new B();
		A a = new A();
		b.p(10);
		b.p(10.0);
		a.p(10.0);

	}
}

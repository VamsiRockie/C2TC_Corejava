package projects;

class A{
	void run()
	{
		System.out.println("Hi");
	}
}

public class b extends A {
	void run()
	{
		System.out.println("Hello");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		A obj1 = new A();
		obj.run();
		obj1.run();

	}

}


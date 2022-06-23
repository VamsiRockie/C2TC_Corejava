package projects;

public class MainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t =Thread.currentThread();
		System.out.println("the ethread is "+t.getName());
		t .setName("Vamsi");
		System.out.println("new thread name is ="+t.getName());

	}

}
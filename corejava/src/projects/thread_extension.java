package projects;

	public class thread_extension extends Thread {
		public void run()
		{
			System.out.println("VAMSI");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Thread t=new thread_extension();
			t.start();

		}

	}
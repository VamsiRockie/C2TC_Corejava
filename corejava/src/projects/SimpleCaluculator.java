package projects;

public class SimpleCaluculator {
	
	void prnsqr(int i)
	 {
		 System.out.println("Square of the int"+i+"is"+i*i);
	 }
	void prnsqr(String s)
	 {
		 System.out.println("Square of the String"+s+"is"+s);
	 }
 void prnsqr(float f)
 {
	 System.out.println("Square of the float"+f+"is"+f*f);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

SimpleCaluculator obj = new SimpleCaluculator(); 
obj.prnsqr(5); 
obj.prnsqr('a'); 
//obj.prnsqr(3.4);
	}

}

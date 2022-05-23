package corejava_package;
abstract class Atm

{
		abstract void withdraw();
}
public class pgm3 extends Atm {
	void withdraw()
	{
		System.out.println("withdraw successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pgm3 ob1=new pgm3();
		ob1.withdraw();
	}

}

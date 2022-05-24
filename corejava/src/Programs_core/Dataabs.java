package Programs_core;
abstract class atm
{
	abstract void withdraw();
}
public class Dataabs extends  atm {
void withdraw()
{
	System.out.println("withdraw successfully");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Dataabs ob1=new Dataabs();
	ob1.withdraw();
}

}

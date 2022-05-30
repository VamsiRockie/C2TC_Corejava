package projects;

class superclass//parent class
{
	void display()
{
			System.out.println("I am a Super class");
}
}
public class subclass extends superclass
{
	void display1() {
			System.out.println("I am a Sub class");
}
public static void main(String[] args) {
// TODO Auto-generated method stub 
	subclass ob = new subclass();
ob.display(); 
ob.display1();
}
}
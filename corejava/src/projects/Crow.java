package projects;
class Birds{
void fly() {
	System.out.println("I am a Bird");
   }
}
class Parrots extends Birds{
void whatcolorAmI(){
System.out.println("I am green");
}
}
public class Crow extends Birds{
void whatcolorAmI() { 
System.out.println("I am Black");
}
public static void main(String[] args) {
// 1000 Auto-generated method stub
Parrots par= new Parrots();
Crow cro= new Crow();
par.whatcolorAm1();
par.fly();
cro.whatcolorAmI(); 
cro.fly();
}
}
package corejava_package;
import java.io.*;
public class BRE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("enter your name");
String n = br.nextLine();
System.out.println("welcome:"+n);
	}

}

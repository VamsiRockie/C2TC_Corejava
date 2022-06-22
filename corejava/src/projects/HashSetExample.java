package projects;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<String> set = new LinkedHashSet<String>();
set.add("THIS IS");
set.add("FOR");
set.add("ME");
set.add("IS");
set.add("Verry helpful");
	Iterator<String>itr=set.iterator();
	System.out.println(itr.next());
	}

}

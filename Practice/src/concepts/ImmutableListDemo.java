package concepts;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ImmutableListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("1","2","3");
		//list.set(1,"4");
		for(String s : list) {
			s = s+"--";
		}
		System.out.println(list.toString());
		
		Set s = new TreeSet();
		//s.add(null);
		s.add("1");
		s.add("hey");
		System.out.println("S : "+s);

	}

}
	
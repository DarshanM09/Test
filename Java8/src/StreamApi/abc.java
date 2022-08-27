package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class abc {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("avsg");
		l.add("avsg");
		l.add("avsg");
		l.add("avsg");
		l.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst()
		.get();

	}
}

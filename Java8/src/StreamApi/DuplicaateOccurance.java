package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicaateOccurance {

	public static void main(String[] args) {
		
		int [] a= {1,2,4,6,3,6,8,54,3,1};
		List<Integer> l=new ArrayList<Integer>();
		for(int i:a) {
			l.add(i);
		}
		l.add(2);
		System.out.println(l);
		l.stream().filter(x->Collections.frequency(l, x)>1)
		.forEach(x->System.out.println(x));
		
		for(Integer i:l) {
			System.out.println(i+" : "+Collections.frequency(l, i));
		}
		
	}
	
	
}

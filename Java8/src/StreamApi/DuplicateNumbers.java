package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	
	
	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,1};
		
		List<Integer> l=new ArrayList<Integer>(a.length);
		for(int i: a) {
			l.add(i);
		}

		List<Integer> collect = l.stream().filter(z->Collections.frequency(l, z)>1).collect(Collectors.toList());
		System.out.println(collect);
		
		Set<Integer> set=new HashSet<Integer>();
	
		List<Integer> collect2 = l.stream().filter(x->!set.add(x)).collect(Collectors.toList());
	
		System.out.println(collect2);
	
	}
	
	
	
	
	

}

package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstFiveORLastFive {

	public static void main(String[] args) {
		
		int[] a= {1,2,4,6,3,1,5,7,5,3,67};
		List<Integer> list=new ArrayList<Integer>(a.length);
		for(int i:a) {
			list.add(i);
			
		}
		System.out.println(list);
		
		
		list.stream().sorted().distinct().forEach(x->System.out.println(x));
		
		List<Integer> collect = list.stream().sorted().distinct().limit(5).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		
	}
}

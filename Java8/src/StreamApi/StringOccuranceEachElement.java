package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOccuranceEachElement {

	
	public static void main(String[] args) {
		
		String s="jpaRepoository";
		char[] charArray = s.toCharArray();
		for(char c:charArray) {
			System.out.println(c);
		}
	
		String s1=new String(charArray);
		System.out.println(s1);

		
		List<Character> list1=new ArrayList<Character>();
		for(char c1:charArray) {
			list1.add(c1);
		}
		System.out.println(list1);
		
		
		for(Character x:list1) {
			System.out.println(x+" : "+Collections.frequency(list1, x));
		}
		
		Character character = list1.stream().filter(x->Collections.frequency(list1, x)>1).max((e1,e2)->e1.compareTo(e2)).get();
	
		System.out.println(character);
	}
}

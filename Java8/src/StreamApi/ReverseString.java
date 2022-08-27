package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		String s="Darshan";
		char[] charArray = s.toCharArray();
		//for(char)
		List<Character> c=new ArrayList<Character>();
		for(char n:charArray) {
			c.add(n);
		}
		System.out.println(c);
		List<Character> collect = c.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	
		System.out.println(collect);
	
	for(int i=charArray.length-1;i>=0;i--) {
		System.out.print(charArray[i]);
	}
		
		
		
	}	
}

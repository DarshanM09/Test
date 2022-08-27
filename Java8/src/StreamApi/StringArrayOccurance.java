package StreamApi;

public class StringArrayOccurance {

	public static void main(String[] args) {
		
		String name="j,a,v,a";
		String[] split = name.split(",");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]);
		}
		
		String name1="Java SpringBoot";
		String[] split2 = name1.split("");
		for(int i=split2.length-1;i>=0;i--) {
			System.out.print(split2[i]);
		}
	}
}

package StreamApi;

public class CheckAges {

	public static void checkage(int age)throws CustomeExceptions{
	if(age>18) {
		throw new CustomeExceptions("Not applicable");
	}else {
		System.out.println("applicable");
	}
	
	
		
	}
public static void main(String[] args) {
	try {
		checkage(20);
	} catch (CustomeExceptions e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
	}
}
}

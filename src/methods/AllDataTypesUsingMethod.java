package methods;

public class AllDataTypesUsingMethod {

	public static void main(String[] args) {
		
	AllDataTypesUsingMethod all=new AllDataTypesUsingMethod();
	all.marksheet();

	}
	public void marksheet()
	{
		String name="Lekha";
		int roll_no=12;
		float age=31.4f;
		char div='A';
		float marks=88.99f;
		boolean result=true;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Student Name is "+name);
		System.out.println("Student Roll No is "+roll_no);
		System.out.println("Student Age is "+age);
		System.out.println("Student Division is "+div);
		System.out.println("Student Marks is "+marks+ " %" );
		System.out.println("Student Result is"+result);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}

}

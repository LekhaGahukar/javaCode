package interface_study;

public class Canada implements India{

	public static void main(String[] args) 
	{
	   Canada c1=new Canada();
	   c1.test1();
	   c1.test2();
	   c1.test3();

	}

	@Override
	public void test1() 
	{
	
		System.out.println("this is test1");
	}

	@Override
	public void test2() 
	{
		// TODO Auto-generated method stub
		 System.out.println("this is test2");
		
	}
	public void test3() 
	{
		System.out.println("this is test3");		
		
	}

}

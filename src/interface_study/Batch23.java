package interface_study;

public class Batch23 implements Automation,Manual
{

	public static void main(String[] args)
	{
		Batch23 b1=new Batch23();
		b1.functional();
		b1.non_functional();
		b1.java();
		b1.selenium();
		
		

	}

	@Override
	public void functional() 
	{
		
		System.out.println("manual method 1");
	}

	@Override
	public void non_functional()
	{
		
		System.out.println("manual method 2");
	}

	@Override
	public void java()
	{
		System.out.println("Automation Method 1");
	
		
	}

	@Override
	public void selenium()
	{
	  System.out.println("Automation Method 2");
		
	}

}

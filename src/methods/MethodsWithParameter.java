package methods;

public class MethodsWithParameter 
{

	public static void main(String[] args) 
	{
		MethodsWithParameter me=new MethodsWithParameter();
		me.parameter(50, 70);
		me.parameter2(90, 50);
		

	}
	public void parameter(int a,int b)
	{
	int sum=a+b;
	System.out.println("Sum of two numbers is "+sum);
	
	}
	public void parameter2(int x,int y)
	{
		int sub=x-y;
		System.out.println("Subtraction of two numbers is "+sub);
		
	}
}

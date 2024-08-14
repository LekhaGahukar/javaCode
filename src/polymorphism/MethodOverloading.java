package polymorphism;

public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
	m.sum();
	m.sum(20, 40);
	m.sum(10, 20, 30);
		

	}
	public void sum()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void sum(int c,int d,int e)
	{
		int sum=c+d+e;
		System.out.println(sum);
	}

}

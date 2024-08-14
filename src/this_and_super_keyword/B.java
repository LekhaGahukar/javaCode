package this_and_super_keyword;

public class B extends A 
{
	int a=70;

	public static void main(String[] args) 
	{
		B b=new B();
		b.display();
		
	}
	public void display()
	{
		//int c=50;
		int sum=a+10;
		System.out.println(sum);
		int sum1=super.a+30;
		System.out.println(sum1);
		
		
	}

}

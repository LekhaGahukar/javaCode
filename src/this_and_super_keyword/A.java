package this_and_super_keyword;

public class A 
{
   int a=20;
	public static void main(String[] args) 
	{
		A c=new A();
		c.submit();

	}
	public void submit()
	{
		int a=30;
		int sum=a+10;
		System.out.println(sum);
		int sum1=this.a+30;
		System.out.println(sum1);
		
		
	}

}

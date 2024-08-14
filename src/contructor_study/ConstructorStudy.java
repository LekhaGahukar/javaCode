package contructor_study;

public class ConstructorStudy 
{
 //using constructor variable initialization
	int a=10;
	int b=20;
	
	public ConstructorStudy(int x,int y)
	{
		a=x;
		b=y;
	}
	
	public static void main(String[] args) 
	{
		ConstructorStudy cs=new ConstructorStudy(20,30);
		cs.display();
	}
	public void display()
	{
		int sum=a+b;
		System.out.println("Sum "+sum);
	}
   
}

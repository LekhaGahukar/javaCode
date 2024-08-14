package polymorphism;

public class MethodOverriding1
{

	public static void main(String[] args)
	{
		MethodOverriding m=new MethodOverriding();
		MethodOverriding1 m1=new MethodOverriding1();
	    m.greeting();
		
	}
     public void greeting()
     {
    	 System.out.println("Good night");
     }
}

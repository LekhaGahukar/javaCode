package contructor_study;

public class Constructor123
{
	//constructor with object initialization
	//standard way to declared constructor before main method
    public Constructor123()
    {
    System.out.println("this is constructor");
    }
    public Constructor123(int a)
    {
    	System.out.println("this is parametered constructor "+a);
    }
    public Constructor123(String b)
    {
    	System.out.println("This is string type parameter "+b);
    }

	public static void main(String[] args)
    {
		Constructor123 cs=new Constructor123();	
		Constructor123 cs1=new Constructor123(20);
		Constructor123 cs2=new Constructor123("Velocity"); 

	}

}

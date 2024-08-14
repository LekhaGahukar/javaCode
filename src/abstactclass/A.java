package abstactclass;

public abstract class A
{
	public static void main(String[] args) 
	{
		//Abstact_study a=new Abstact_study();
		
		//we cannot create the object of abstract class because if 
		//we create the object we call abstract method but we cannot call abstract method
		//because they do not have behaver/execution part so in java does not support to create the
		//object of abstract class

	}
	public void test1()
	{
	   System.out.println("This is test 1 method");		
	}
    public void test2()
    {
    	System.out.println("This is test 2 method"); 
    } 
    public abstract void test3();//we cannot declared incomplete method so by using abstract keyword we declare incomplete method  
  
}

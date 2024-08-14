package accessspecifier;


public class Demo {
	private int a=20;
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.test1();  
		
	}
    private void test1()
     {
    	 System.out.println("this is test1 method "+a);
     }
}

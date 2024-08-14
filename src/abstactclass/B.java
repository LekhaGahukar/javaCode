package abstactclass;

public class B extends A
{
 public static void main(String[] args) 
 {
	 B b=new B();
	 b.test5();
	 b.test3();//by using concrete class to possible calling abstract class method or abstract method 
	 b.test1();
	 b.test2();
	
 }
 public void test5()
 {
	 System.out.println("this is B class method");
 }
@Override
public void test3() 
{
System.out.println("this is abstract method of class A");	
	
}

	

}

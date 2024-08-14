package inheritance;

public class Hierachical_Inheritance_Study 
{
	public static void main(String[] args)
	{
		Daughter d=new Daughter();
		d.recipe();
		d.look();
		d.hobbies();
		d.study();
		
		System.out.println("=================================");
		
		Son s =new Son();
		s.recipe();
		s.look();
		s.mobile();
		s.laptop();
		
		
	}

	
}

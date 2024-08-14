package inheritance;

public class MutilevelInheritance 
{
	public static void main(String[] args)
	{
		/*Grandmother g=new Grandmother();
		g.singing();
		g.stories();
		
		Mother m=new Mother();
		
		m.singing();//grandmother method
		m.stories();//grandmothers method
		
		m.recipe();//mothers method
		m.look();//mothers method */
		
		Daughter d=new Daughter();
		d.singing();
		d.stories();
		d.recipe();
		d.look();
		d.study();
		d.hobbies();
				
		
		
		
	}

}

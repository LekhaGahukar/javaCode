package controlstatement;

public class NestedIfElse 
{

	public static void main(String[] args)
	{
		String id="lekha";
		String password="@lekha123";
		
		if(id=="lekha")
		{
			System.out.println("Id is correct enter password ");
			
			if(password=="@lekha")
			{
				System.out.println(" Login Successfully");
			}
			else
			{
				System.out.println("password is incorrect");
			}
		}
		else
		{
			System.out.println("id is incorrect ");
		}
		
	}

}

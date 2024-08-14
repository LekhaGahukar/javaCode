package controlstatement;

public class ElseIf 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int marks=70;
		if(marks>=60)
		{
			System.out.println("1st Class");
		}
		else if(marks>=50)
		{
			System.out.println("2nd Class");
		}
		else if(marks>=40)
		{
		System.out.println("Just Pass");
		}
		else
		{
			System.out.println("Fail");
		}

		System.out.println("==================================");
		
		String signal="yellow";
		
		if(signal=="green")
		{
			System.out.println("Go");
		}
		else if(signal=="yellow" )
		{			
		System.out.println("Ready to Go");
		}
		else 
		{
			System.out.println("Stop");		
		}
		
		
	}

}

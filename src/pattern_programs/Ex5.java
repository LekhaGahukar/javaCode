package pattern_programs;

public class Ex5 {

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		int row=5,star=5;	
		//int column=5;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*"); 
			}
			System.out.println(" ");
			star--;
		}
		

	}

}

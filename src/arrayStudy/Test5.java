package arrayStudy;

public class Test5 {

	public static void main(String[] args)
	{
		String str[][]=new String[3][2];
		
		str[0][0]="payal";
		str[0][1]="lekha";
		str[1][0]="Anvit";
		str[1][1]="pooja";
		str[2][0]="kavya";
		str[2][1]="gauri";
		for(int i=0;i<=2;i++) 
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		

	}

}

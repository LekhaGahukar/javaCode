package pattern_programs;

public class Ex10 
{

	public static void main(String[] args) 
	{
		//       * 
		//     *   *
		//   *   *   * 
		// *   *   *   *
		int row=4;
		//int column=4;
		int space=3;
		int star=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
			space--;
			star++;
		}
		

	}

}

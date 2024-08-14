package pattern_programs;

public class Ex14 
{
public static void main(String[] args)
{    //        *
	 //       * *
	//       * * * 
	//      * * * *
	//       * * * 
	 //       * *
	//         *
	 int row1=4;
	
	 int space1=3;	 
	 int star1=1;
	 int star2=3;
	 int space2=1;
	 int row2=3;
	
	 
	 for(int i=1;i<=row1;i++)
	 {
		 for(int j=1;j<=space1;j++)
		 {
			System.out.print(" "); 
		 }
		 for(int k=1;k<=star1;k++)
		 {
			System.out.print("* ");
		 }
		 System.out.println();
		 space1--;
		 star1++;
		 
	 }
	
	    for(int i=1;i<=row2;i++)
	    {
		for(int j=1;j<=space2;j++)
		{
			System.out.print(" "); 
		}
		for(int k=1;k<=star2;k++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
		space2++;
		star2--;
	    }
	
	
	
}
}

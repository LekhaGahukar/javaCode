package pattern_programs;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//          *
		//        * *
		//      * * *
		//    * * * *
		//      * * *
		//        * *
		//          *
		int row=7;
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
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star++;
				space--;
			}
			else
			{
				star--;
			    space++;
		    }
			
		}

	}

}

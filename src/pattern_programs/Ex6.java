package pattern_programs;

public class Ex6 {

	public static void main(String[] args) {
		//    *
      	//   **
       //   ***
	  //   ****
	//    *****
		int row=5;
		//int column=5;
		int star=1;
		int space=4;
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
			System.out.println(" ");
			space--;
			star++;
		}
		
	}

}

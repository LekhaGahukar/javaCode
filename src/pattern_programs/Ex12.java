package pattern_programs;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//           *
		//           **
 		//           ***
		//           ****
		 //          ***
		//           **
		//           *
        int row=7;
        //int column=4;
        int star=1;
        for(int i=1;i<=row;i++)
        {
        	for(int j=1;j<=star;j++)
        	{
        		System.out.print("*"); 
        	}
        	System.out.println(" ");
        	if(i<4)
        	{
              star++;
        	}
        	else
        	{
        		star--;
        	}
        }
	}

}

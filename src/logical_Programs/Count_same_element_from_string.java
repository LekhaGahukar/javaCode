package logical_Programs;

public class Count_same_element_from_string {

	public static void main(String[] args) 
	{
		String str="AKSHAY";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
		   char temp = str.charAt(i);
		   if(temp=='A')
		   {
			   count++;
		   }
		   
		}
		System.out.println("Number of A present in String "+count);			
	}

}

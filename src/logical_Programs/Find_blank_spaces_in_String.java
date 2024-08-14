package logical_Programs;

public class Find_blank_spaces_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ve l o c i ty";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) 
		{
			char temp = str.charAt(i);
			if(temp==' ')
			{
				count++;
			}
		}
		
    System.out.println("Number of blank spaces is "+count);
	}

}

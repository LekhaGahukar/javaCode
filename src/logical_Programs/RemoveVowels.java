package logical_Programs;

public class RemoveVowels {

	public static void main(String[] args) {
		String a="Apple";
		String z="";
		String a2=a.toLowerCase();
		for(int i=0;i<=a2.length()-1;i++)
		{
		   char	temp=a2.charAt(i);
		   if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
		   {
			   continue;
		   }
		   z=z+temp;
		}
	   System.out.println(z);
	}
	

}

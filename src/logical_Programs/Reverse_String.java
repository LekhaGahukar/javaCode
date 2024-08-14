package logical_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		String str="Payal";
		String rev="";
		System.out.println("Original String is "+str);
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The Reverse String is "+rev);

	}

}

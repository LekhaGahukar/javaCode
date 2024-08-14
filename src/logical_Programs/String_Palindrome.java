package logical_Programs;

public class String_Palindrome {

	public static void main(String[] args) {
		String str="nitin";
		String rev="";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);
		}
			System.out.println("Original String " + str);
			System.out.println("Reverse String " + rev);
			if (str.equals(rev))
			{
			System.out.println("String is Palindrome");
			} 
			else 
			{
			System.out.println("String is not Palindrome");
			}
	}

}

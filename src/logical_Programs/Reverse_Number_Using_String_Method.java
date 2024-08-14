package logical_Programs;

public class Reverse_Number_Using_String_Method {

	public static void main(String[] args) {
		int number=12345;
		int revNum;
		String rev="";
		String numberInString = Integer.toString(number);
		for(int i=numberInString.length()-1;i>=0;i--)
		{
			rev=rev+numberInString.charAt(i);
			
		}
		revNum=Integer.parseInt(rev);
		System.out.println("Reverse number is "+revNum);
	}

}

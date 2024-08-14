package practice;

public class Plindrome {

	public static void main(String[] args)
	{
		int n=243;
		int r,sum=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}

package logical_Programs;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		int num=56789;
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
	}

}

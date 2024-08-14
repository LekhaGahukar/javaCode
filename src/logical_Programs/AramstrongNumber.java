package logical_Programs;

public class AramstrongNumber {

	public static void main(String[] args) {
		int num=123;
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev+(rem*rem*rem);
			
		}
		if(num==rev)
		{
			System.out.println("Number is AramStrong");
		}
		else
		{
			System.out.println("Number is not AramStrong");
		}
	}

}

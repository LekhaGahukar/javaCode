package logical_Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		//// 10 -->1,2,5 not prime
		// 3-->1,3 prime
		// 11-->1,11 prime
		// 12-->2,3,4,6,not prime number
		int num=11;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}

	}

}

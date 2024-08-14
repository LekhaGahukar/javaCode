package arrayStudy;

import java.util.Arrays;

public class SortStudy 
{

	public static void main(String[] args) 
	{
		int num[]=new int[5];
		
		num[0]=9;
		num[1]=19;
		num[2]=90;
		num[3]=10;
		num[4]=4;
		System.out.println("======printing array using loop======");
		for(int i=0;i<=4;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("======printing array in ascending order using loop======");
		Arrays.sort(num);
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("======printing array in desending order using loop======");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		

	}

}

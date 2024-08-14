package practice;

public class Fibbo {

	public static void main(String[] args) {
		
		int n=0; 
		int n1=1;
		int n2;
		System.out.println(n);
		System.out.println(n1);
		for(int i=0;i<=5;i++)
		{
			n2=n+n1;
			System.out.println(n2); 
			n=n1;
			n1=n2;
		}
	}

}

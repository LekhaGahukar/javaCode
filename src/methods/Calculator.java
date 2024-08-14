package methods;

public class Calculator
{
    int a=20;
    int b=10;
	public static void main(String[] args) 
	{
		Calculator calculator=new Calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplicatio();
		calculator.division();
		
		
	}
	 public void addition()
	 {
		 int sum;
		 sum=a+b;
		 System.out.println("Addition is "+ sum);
	 }
	 public void substraction()
	 {
	   int sub;
	   sub=a-b;
	   System.out.println("substraction is "+ sub);
	 }
	 public void multiplicatio()
	 {
		 int mul;
		 mul=a*b;
		 System.out.println("Multiplication is "+ mul);
	 
	 }
	 public void division()
	 {
		 float div;
		 div=a/b;
		 System.out.println("Division is  "+div);
	 }

}

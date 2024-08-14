package practice;

public class Nsted {

	

	  public static void main(String[] args)
	  {
	    int a=7000,b=30000,c=900;
	    
	    if(a>b)
	    {
	      if(a>c)
	      {
	        System.out.println("A is greater");
	      }
	      if(b>a)
	      {
	       if(b>c)
	       {
	         System.out.println("B is greater");
	       }
	      }
	      if(c>a)
	      {
	        if(c>b)
	        {
	          System.out.println("C is greater");
	        }
	      }
	    }
	  }
	}
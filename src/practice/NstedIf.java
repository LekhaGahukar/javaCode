package practice;

public class NstedIf
{
  public static void main(String[] args)
  {
    int a=20,b=160,c=189;
    if(a>b)
    {
      if(a>c)
       {
         System.out.println("A is greater");
       }
       else
       {
         System.out.println("C is greater");
       } 
    } 
     else if(b>c)
      {
    	  System.out.println("B is greater"); 
      }     
      else
      {
    	  System.out.println("C is greater");
      }  
   
  }
}
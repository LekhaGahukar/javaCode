//day 1=monday
//day7=sunday

//by using switch case

package practice;

public class SwitchStudy
{
   public static void main(String[] args)
   {
     int day=5;
     
     switch(day)
     {
       case 1:
              System.out.println("Monday");
       break;
       case 2:
              System.out.println("Thuesday");
       break;
       case 3:
              System.out.println("wednsday");
       break;
       case 4:
              System.out.println("Thusday");
       break;
       case 5:
              System.out.println("Friday");
       break;
       case 6:
              System.out.println("Saturday");
       break;
       case 7:
              System.out.println("Sunday");
       break;
       default:
               System.out.println("Select day from 1 to 7");
       break;  
     }
        
     } 
   } 
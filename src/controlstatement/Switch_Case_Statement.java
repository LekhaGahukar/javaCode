package controlstatement;

public class Switch_Case_Statement {

	public static void main(String[] args)
	{
	int day=3;
	
	switch (day) 
	{
	    case 1:
	    	System.out.println("Today is Sunday");		
		break;
	    case 2:
	    	System.out.println("Today is Monday");		
		break;
	    case 3:
	    	System.out.println("Today is Tuesday");		
		break;
	    case 4:
	    	System.out.println("Today is Wednesday");		
		break;
	    case 5:
	    	System.out.println("Today is Thusday");		
		break;
	    case 6:
	    	System.out.println("Today is Friday");		
		break;
	    case 7:
	    	System.out.println("Today is Satrday");		
		break;

	default:
		System.out.println("INVALID DAY ENTER DAY BETWEEN 1 TO 7");
		break;
	}

	}

}

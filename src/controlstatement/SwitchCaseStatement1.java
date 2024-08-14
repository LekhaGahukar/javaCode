package controlstatement;

public class SwitchCaseStatement1 {

	public static void main(String[] args) {
		String month="Feb";
		
		switch (month) {
		    case "Jan":
			    System.out.println("1st Month");			
			break;
		    case "Feb":
				System.out.println("2nd Month");			
			break;
		    case "March":
				System.out.println("3rd Month");			
			break;
		    case "April":
				System.out.println("4th Month");			
			break;
		    case "May":
				System.out.println("5th Month");			
			break;
		    case "June":
				System.out.println("6th Month");			
			break;
		    case "July":
				System.out.println("7th Month");			
			break;
		    case "August":
				System.out.println("8th Month");			
			break;
		    case "Sep":
				System.out.println("9th Month");			
			break;
		    case "Oct":
				System.out.println("10th Month");			
			break;
		    case "Nov":
				System.out.println("11th Month");			
			break;
		    case "Dec":
				System.out.println("12th Month");			
			break;


		default:
			System.out.println("Enter correct month between 1 to 12");
			break;
		}
	}

}

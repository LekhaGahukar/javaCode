package arrayStudy;

public class Test2 {

	public static void main(String[] args) 
	{
	   String name[]=new String[7];
	   name[0]="Anvit";
	   name[1]="Pooja";
	   name[2]="Gauri";
	   name[3]="Sagar";
	   name[4]="Kaivalya";
	   name[5]="Poonam";
	   name[6]="Laxmi";
	   
	  // System.out.println(name[5]);
	  // System.out.println(name[0]);
	   for(int i=0;i<=6;i++)
	   {
		   System.out.println(name[i]);
	   }
	   System.out.println("===================================");
	   System.out.println(name.length);
	   System.out.println("===================================");
	   for(int i=0;i<=name.length-1;i++)
	   {
		   System.out.println(name[i]);  
	   }
	   System.out.println("===================================");
	   //print name in reverse order
	   for(int i=name.length-1;i>=0;i--)
	   {
		   System.out.println(name[i]);
	   }
	   
	   

	}

}

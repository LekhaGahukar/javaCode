package string_study;

public class Testing {

	public static void main(String[] args) 
	{
		//To find length()
		String s="pune";
		int str=s.length();
		System.out.println(str);
		System.out.println("=======================================================");
		
		//touppercase()
		
		String s1="engineering";
		String str1=s1.toUpperCase();
		System.out.println(str1);
		System.out.println("=======================================================");
		
		//toLowerCase
		String s2="ENGINEERING";
		String str2=s2.toLowerCase();
		System.out.println(str2);
		System.out.println("=======================================================");
		
		//4.Equals(it compare the value/content (==):-it compare the memory location)
		
		String c1="Ram";
		String c2="Ram";
		String c3=new String("Ram");
		String c4=new String("Ram");
		String c5=new String("RAM");
		
		//this is (==)(it compare the memory location) 
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c4);
		System.out.println("==========================================================");
		//this is equals()(it comapre value)
        System.out.println(c1.equals(c2));		
        System.out.println(c2.equals(c3));
        System.out.println(c4.equals(c5));
        System.out.println(c4.equalsIgnoreCase(c5));
        System.out.println("===========================================================");
		
		//contains()
        String str5="Engineering";
        boolean result=str5.contains("E");
        System.out.println(result);        
        System.out.println("===========================================================");
        
        //isEmpty  
        String a4="testing";
        String a="";  //this is empty
        String a1=" ";//this is include white space
        String a2=null;//this is not empty 
        String a3="                     ";//this is not empty//this is Blank
        System.out.println(a.isEmpty());
        System.out.println(a4.isEmpty());
        System.out.println(a1.isEmpty());
        //System.out.println(a2.isEmpty());
        System.out.println(a3.isEmpty());
        System.out.println("============================================================");
        
        //isBlank
        System.out.println(a.isBlank());
        System.out.println(a4.isBlank());
        System.out.println(a1.isBlank());
        //System.out.println(a2.isBlank());
        System.out.println(a3.isBlank());
        System.out.println("============================================================");
        
        
        //charAt
        String s6="Testing";//T=0,e=1,s=2,t=3i=4,n=5,g=6
        System.out.println(s6.charAt(6));
        System.out.println(s6.charAt(0));
        System.out.println(s6.charAt(3));
        System.out.println(s6.charAt(5));
        System.out.println(s6.charAt(4));
        System.out.println(s6.charAt(1));
        System.out.println("============================================================");
        
        //endsWith()
        String g1 = "Engineering";
        System.out.println(g1.endsWith("ring"));
        System.out.println(g1.endsWith("ng"));
        System.out.println(g1.endsWith("rong"));
        System.out.println(g1.endsWith("Engineering"));
        System.out.println(g1.endsWith("g"));
        System.out.println("====================================");
     
        // startsWith()
        System.out.println(g1.startsWith("Eng"));
        System.out.println(g1.startsWith("Engineering"));
        System.out.println(g1.startsWith("ring"));
        System.out.println(g1.startsWith("in"));
        System.out.println("====================================");
        
        //substring
        String h1="engineering";
        System.out.println(h1.substring(7));
        System.out.println(h1.substring(4));
        
        System.out.println(h1.substring(4, 11));//always do (endindex+1)
        System.out.println(h1.substring(4,9));
        
        System.out.println("====================================");
        
        //Concat
        String i1="sofeware";
        String i2="testing";
        
        System.out.println(i1.concat(i2));
        String i3 = i1.concat(i2);
        System.out.println(i3);
        System.out.println(i3.concat("Classes"));
        System.out.println("====================================");
        
        
        
        
        
        
        
        
        
        
        
        
        
		
				
		
		
		

	}

}

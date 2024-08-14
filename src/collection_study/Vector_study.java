package collection_study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study 
{

	public static void main(String[] args) 
	{
	    Vector<Object> ve=new Vector<Object>();
	    ve.add("Welcome");
	    ve.add('H');
	    ve.add("WELCOME");
	    ve.add(12);
	    ve.add(12.34);
	    ve.add(true);
	    ve.add(null);
	    ve.add("Welcome");
	    
	    System.out.println(ve);
	    ve.add(3,90);
	    System.out.println(ve);
	    
	    ve.addFirst("payal");
	    ve.addLast("gahukar");
	    System.out.println(ve);
	    
	    System.out.println(ve.size()); //size means 0-10 length=lastindex+1=11 
	    System.out.println(ve.capacity());//capacity of vector is bydefault 10 but if size is 
	                                      //11 then capacity will became double means 20
	                                      //if size is 21 or greater than 21 then capacity is 40
	    
	    Object v2=ve.clone();
	    System.out.println(v2);
	    
	    System.out.println(ve.contains("payal"));
	    
	    System.out.println(ve.elementAt(9));
	    System.out.println("============for loop====================");
	    //for loop
	    for(int i=0;i<=ve.size()-1;i++)
	    {
	    	System.out.println(ve.get(i));
	    }
	    System.out.println("===========for each=====================");
	    //for each
	    
	    for(Object e:ve)
	    {
	    	System.out.println(e);
	    }
	    System.out.println("============Iterator====================");
	    //Iterator
	    Iterator<Object>it=ve.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    System.out.println("=========list-iterator===============");
	    ListIterator<Object> li=ve.listIterator();
	    while(li.hasNext())
	    {
	    	System.out.println(li.next());
	    }
	    System.out.println("=========reverse============");
	    while(li.hasPrevious())
	    {
	    	System.out.println(li.previous());
	    }
	    
	    System.out.println("=========enumeration===========");
	    Enumeration< Object> ele=ve.elements();
	    while (ele.hasMoreElements()) 
	    {
			System.out.println( ele.nextElement());
			
		}
	    
	    
	    

	}

}

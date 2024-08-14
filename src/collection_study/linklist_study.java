package collection_study;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linklist_study 
{
	public static void main(String[] args) 
	{
	LinkedList<Object> lil=new LinkedList<Object>();
	
	lil.add("hello");
	lil.add(12);
	lil.add("hello");
	lil.add(null);
	lil.add(null);
	lil.add(true);
	lil.add("payal");
	lil.add(12.23);
	lil.add('a');
	
    System.out.println(lil);
    
    System.out.println(lil.get(5));
    
    System.out.println(lil.contains('a'));
    
    System.out.println(lil.element());
    System.out.println(lil);
    
    System.out.println(lil.peek());
	System.out.println(lil);
	
	System.out.println(lil.poll());
	System.out.println(lil);
	
	System.out.println(lil.pop());
	System.out.println(lil);
	
    lil.push("velocity");
	System.out.println(lil);
	System.out.println("=========for loop==========");
	
	for(int i=0;i<=lil.size()-1;i++)
	{
		System.out.println(lil.get(i));
	}	
	System.out.println("========for-each============");
	for(Object l:lil)
	{
		System.out.println(l);
	}	
	System.out.println("=========iterator===========");
	
	Iterator<Object> it=lil.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("=========List-iterator=========");
	ListIterator<Object>  lit=lil.listIterator();
	while(lit.hasNext())
	{
		System.out.println(lit.next());
	}
	
		
	
	}
   
}

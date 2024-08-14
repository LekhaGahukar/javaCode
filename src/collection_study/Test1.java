package collection_study;

import java.util.ArrayList;

public class Test1 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(20);
		al.add(null);
		al.add(50);
		al.add(90);
		System.out.println(al);
		
		al.add(70);
		al.add(54);
		al.add(67);
		System.out.println(al);
		
		al.addLast(63);
		System.out.println(al);
		
		al.addFirst(null);
		System.out.println(al);
		
		Object alnew = al.clone();
		System.out.println(alnew);
		
		System.out.println(al.contains(20));
		
		System.out.println(al.get(3));
		
		
		
		
		
		
		

	}

}

package practice;

import java.util.LinkedList;
		//import java.util.TreeSet;
		public class Test1 {
		public static void main(String[] args)
		{
		/*TreeSet<Object> ts= new TreeSet<Object>();
		//ts.add(9);
		//ts.add("pune");//-->ClassCastException
		//ts.add(null);//-->NullPointerException

		ts.add(13);
		ts.add(4);
		ts.add(11);
		ts.add(7);
		ts.add(5);
		System.out.println(ts);
		//ts.addFirst(0);
		//ts.
		System.out.println(ts);

		System.out.println(ts.ceiling(7));
		System.out.println(ts.floor(3));
		System.out.println(ts.first());
		System.out.println(ts.higher(8));
		System.out.println(ts.lower(7));
		System.out.println(ts.size());

		}*/
			
				LinkedList<Object>ll= new LinkedList<Object>();
				ll.add("Hello");
				ll.add(null);
				ll.add(null);
				ll.add("Hello");
				ll.add(12);

				ll.add(true);
				ll.add(12.12);
				ll.add('A');
				System.out.println(ll);
				System.out.println(ll.get(5));
				System.out.println(ll.element());
				System.out.println(ll);
				System.out.println(ll.peek());
				System.out.println(ll);
				System.out.println(ll.poll());
				System.out.println(ll);

				System.out.println(ll.pop());
				System.out.println(ll);

				ll.push("Velocity");
				System.out.println(ll);

				}
		
	}



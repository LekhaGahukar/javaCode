package logical_Programs;

import java.util.ArrayList;
import java.util.TreeSet;

public class Find_largest_smallest_no_using_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,98,90,100,67,90,45,60,89};
		TreeSet<Integer> tree=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			tree.add(arr[i]);
		}
        System.out.println(tree);
        ArrayList<Integer> arList=new ArrayList<Integer>(tree);
        System.out.println(arList.get(0));
        System.out.println(arList.get(3));
        System.out.println(arList.get(arList.size()-1));
        System.out.println(arList.get(arList.size()-2));
	}

}

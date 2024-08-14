package logical_Programs;

public class Find_duplicate_Element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,5,7,9,10,1,7,5,4,6};
	     int count=0;
	     System.out.println("Duplicate elements are: ");
	     for(int i=0;i<arr.length;i++)
	     {
	         for(int j=i+1;j<arr.length;j++)
	         {
	             if(arr[i]==arr[j])
	             {
	                 System.out.print(arr[i]+" ");
	                 count++;
	             }
	         }
	     }
	     System.out.println();
	     System.out.println("Number of duplicate elements are " + count);

	}

}

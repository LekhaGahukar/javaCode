package logical_Programs;

public class Perticular_name_reverse_in_String {

	public static void main(String[] args) {
		String s="I love my india";
		//I evol my india
		String s1="love";
		String[] ar=s.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
		if(ar[i].equals(s1))
		{
		String temp=ar[i];
		String rev="";
		for(int j=temp.length()-1;j>=0;j--)

		{
		rev=rev+temp.charAt(j);
		}
		ar[i]=rev;
		}
		System.out.print(ar[i]+" ");

	}

}
}
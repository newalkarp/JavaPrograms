import java.util.*;
import java.io.*;

class JIterator
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
	System.out.println("Enter size of array and element to compare(separated by spaces): ");
	String[] input = new String[2];
	input = s.nextLine().split(" ");
	int n = Integer.parseInt(input[0]);
	int k = Integer.parseInt(input[1]);
	ArrayList<Integer> al = new ArrayList<Integer>(n);
	String[] arlist = new String[n];
	System.out.println("Enter elements of array(separated by spaces): ");
	arlist = s.nextLine().split(" ");
	for (int i=0;i<n;i++)
		al.add(Integer.parseInt(arlist[i]));
	
	Iterator<Integer> i = al.iterator();
	while(i.hasNext())
	{
		int check_num = i.next();
		if (check_num < k)
			i.remove();
	}
    System.out.println("The new array is: " +al);
  }

}
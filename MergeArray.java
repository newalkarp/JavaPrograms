import java.io.*;
import java.util.*;

class MergeArray
{
  public static void combine_arrays(int[] a, int[] b)
  {
    int fin_len = a.length + b.length;
	int[] result = new int[fin_len];
    int i = a.length-1;
    int j = b.length-1;
    int k = a.length + b.length - 1;
    while(i >= 0 && j >= 0)	
	{
		if(a[i] > b[j])
			result[k--] = a[i--];
		else
			result[k--] = b[j--];
	}
	while(i>=0)
	{ 
      result[k--] = a[i--];
    }
	while(j>=0)
	{ 
      result[k--] = b[j--];
    }
    display_result(result);
  }
  public static void display_result(int[] result)
  {
	  for(int k =0; k<result.length; k++)
		  System.out.print(result[k] + " ");
  }
  public static void main(String args[])
  {
    System.out.println("Array 1 is: 1-4-8");
	System.out.println("Array 2 is: 1-2-5-10");
	int[] a = {1,4,8};
	int[] b = {1,2,5,10};
	System.out.print("Merged array is: ");
	combine_arrays(a,b);
  }  
}
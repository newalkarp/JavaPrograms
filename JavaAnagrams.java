import java.io.*;
import java.util.*;

class JavaAnagrams
{
 public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter string 1: ");
   String ip1 = s.next();
   System.out.println("Enter string 2: ");
   String ip2 = s.next();
   char[] str1 = ip1.toCharArray();
   char[] str2 = ip2.toCharArray();
   int n1 = str1.length;
   int n2 = str2.length;
   if(str1.length != str2.length)
   {
	   System.out.println("The strings are not anagrams!");
   }
   else
   {
    quicksort(str1,0,n1-1);
    quicksort(str2,0,n2-1);
    for (int i = 0; i < n1;  i++) 
    {
      if (str1[i] != str2[i]) 
	  {
		  System.out.println("The strings are not anagrams!");
		  break;
	  }
	  else
	  {
		  if ( i == n1 - 1)
		  {
			  System.out.println("Yes..! The strings are anagrams!"); 
		  }
		  else
		  {
		  continue;
		  }
	  }
    }
    
   }
 }
 
 public static void quicksort(char arr[], int low, int high)
 {
   if(low < high)
   {
     int pivot = partition(arr, low, high);
	 quicksort(arr, low, pivot-1);
	 quicksort(arr, pivot+1, high);
   }
 }
 
 public static int partition(char arr[], int low, int high)
 {
   int pivot = arr[high];  
   int i = (low-1); 
   for (int j=low; j<high; j++) 
    { 
     if (arr[j] <= pivot) 
     { 
       i++; 
       char temp;	    
       temp = arr[i]; 
       arr[i] = arr[j]; 
       arr[j] = temp; 
     } 
    } 
       char temp = arr[i+1]; 
       arr[i+1] = arr[high]; 
       arr[high] = temp; 
  
       return i+1;
 }
}

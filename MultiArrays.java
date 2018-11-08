import java.util.*;
import java.lang.*;
import java.io.*;

class MultiArrays {
    public static void compute_output_onedim(int[] onedim)
	 {
	   int max = onedim[0];
	   int i;
	   for(i=0;i<onedim.length;i++)
	   {
	     if(onedim[i]>max)
		   max = onedim[i];
	   }
	   System.out.println("Maximum for 1-d array is: "+max);
	 }
	 
	 public static void compute_output_twodim(int n,int[][] twodim)
	 {
		int sum = 0,i,j;
		for(i=0;i<n;i++)
		{
	     for(j=0;j<n;j++)
		 {
			if(i==j)
			 sum += twodim[i][j];
		 }
		}
		System.out.println("Sum of diagonal elements of 2-d array is: "+sum);
	 }

	 public static void main(String args[])
	 {
	   Scanner s = new Scanner(System.in);
	   	   int i,j,k;
	   System.out.println("Enter n for 1-d and 2-d array: ");
	   int n = s.nextInt();
	   int ip_size = n*n;
	   int[] onedim = new int[ip_size];
	   int[][] twodim = new int[n][n];
	   
	   String[] input = new String[ip_size];
	   System.out.println("Enter n*n elements of array(separated by spaces): ");   
	   String newLineChar = s.nextLine();
	   input = s.nextLine().split(" ");
	
	   for(i=0;i<onedim.length;i++)
	   {
		   int inp = Integer.parseInt(input[i]);
		   onedim[i] = inp;
	   }
        
	
	   for(j=0;j<n;j++)
	   {
		   for(k=0;k<n;k++)
		   {
			   int inp = Integer.parseInt(input[(j*n)+k]);
			   twodim[j][k] = inp;
		   }
	   }
		 
	   compute_output_onedim(onedim);
	   compute_output_twodim(n,twodim);
	 }
}
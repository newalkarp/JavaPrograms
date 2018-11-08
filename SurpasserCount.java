import java.io.*;
import java.util.*;

class SurpasserCount
{
public static void main(String args[])
{
 Scanner s = new Scanner(System.in);
 System.out.println("Enter the size of array: ");
 int n = s.nextInt();
 int[] ip_array = new int[n];
 System.out.println("Enter the elements of array(space separated): ");
 String[] input = new String[n];
 String newlinechar = s.nextLine();
 input = s.nextLine().split(" ");
 for(int i=0;i<ip_array.length;i++)
 {
   ip_array[i] = Integer.parseInt(input[i]); 
 }
 surpasser_count(ip_array);
}
public static void surpasser_count(int[] ip_array)
{
 int i,j;
 int[] op_array = new int[ip_array.length];
 for(i=0;i<ip_array.length;i++)
 {
   int sum = 0;
 for(j=i+1;j<ip_array.length;j++)
 {
   if(ip_array[j]>ip_array[i])
   {
     sum = sum + 1;
   }
 }
 op_array[i] = sum;
 }
 print_output(op_array);
}
public static void print_output(int[] op_array)
{
 System.out.print("Surpasser count array is:");	
 for(int i=0;i<op_array.length;i++)
 {
   System.out.print(" "+op_array[i]);
 }
}
}
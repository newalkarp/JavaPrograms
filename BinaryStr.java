import java.io.*;
import java.util.*;

class BinaryStr
{
 public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a binary string(consisting of 0s, 1s and ?s: ");
   String input = s.nextLine();
   char[] c = input.toCharArray();
   
   print_output(c,0);
 }
 public static void print_output(char[] c, int i)
 {
	int count = 0;
	if(i == c.length)
	{
	 String op = new String(c);
     System.out.println("Output string : "+ op);
	 return;
    }
    if(c[i] == '?')
    {
		c[i]='0';
		print_output(c,i+1);
		
		c[i]='1';
		print_output(c,i+1);
		
		c[i]='?';
	}
    else
	{
		print_output(c,i+1);
	}
 }
}
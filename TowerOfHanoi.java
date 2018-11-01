import java.io.*;
import java.util.*;

class TowerOfHanoi
{
	public static void toh(int n, int from, int to, int temp)
	{
		if (n == 1)
		{
			System.out.println("Move disk 1 from "+ from +" to "+to);
			return;
		}
        toh(n-1, from, temp, to);
		System.out.println("Move disk " +n+" from "+ from +" to "+to);
		toh(n-1, temp, to, from);		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of disks: ");
		int disks = s.nextInt();
		toh(disks,1,3,2);
	}
}
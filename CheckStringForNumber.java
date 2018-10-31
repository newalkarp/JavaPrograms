//checks only a single string 
import java.util.*;
import java.io.*;

class CheckStringForNumber
{
public static boolean check_string (String input_string)
{
  if (input_string != null || input_string != "")
  {
    return input_string.matches("^[a-zA-Z]*$"); //can use charAt ASCII or Lambda expression isLetter
  }
  return false;
}
public static void main (String [] args)
{
  Scanner read_ip = new Scanner(System.in);
  System.out.println ("Enter a string : ");
  String s = read_ip.next(); 
  boolean b = check_string(s);
  if (b == true)
   System.out.println (" Result : True ");
  else
   System.out.println (" Result : False ");
}
}
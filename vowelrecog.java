import java.util.Scanner;

public class vowelrecog
{
 public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
   
   System.out.println("Please enter a string");
   String vowStr = in.next();
  
   Sysem.out.println(vowStr.replaceAll( "[aeiouy]","_" ));
   }
  }
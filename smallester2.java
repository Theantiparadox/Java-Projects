import java.util.Scanner;

public class smallester2
{
 public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
   System.out.println("Please enter i for integer or s for string:");
   String iors = in.next();
   if(iors.equals ("i"))
   {
      
   System.out.println("please enter an integer:");
   double x1 = in.nextDouble();
   
   System.out.println("please enter an integer:");
   double y1 = in.nextDouble();   
   
   System.out.println("please enter an integer:");
   double z1 = in.nextDouble();
   
   double z2 = smallest(x1, y1, z1);
   
   System.out.println("The smallest of the integers is:"+z2);
   }
   if(iors.equals ("s"))
   {
   System.out.println("please enter a string:");
   String x2 = in.next();
   
   System.out.println("please enter a string:");
   String y2 = in.next();   
   
   System.out.println("please enter a string:");
   String z2 = in.next();
   
   String z3 = smallest(x2, y2, z2);
   
   System.out.println("The smallest of the strings is:"+z3);
   
   }
   }
   
   public static double smallest(double x, double y, double z)
   { 
    double result;
	result = 0;
	
	
	if(x < y && y < z)
	  {
	  result = x;
	  }
	if(x < z && z < y)
	  {
	  result = x;
	  }
    if(z < y && y < x)
	  {
	  result = z;
	  }
    if(z < x && x < y)
	  {
	  result = z;
	  }
    if(y < x && x < z)
     {	 
	 result = y;
	 }
    if(y < z && z < x)
	  {
	  result = y;
	  }
	return result;
  }
  public static String smallest(String x, String y, String z)
   { 
    String result;
	result = "a";

   if(x.compareTo(y) < 0 && y.compareTo(z) < 0 && z.compareTo(y) > 0 && y.compareTo(x) > 0)
   {
    result = x;   
   }
   if(x.compareTo(z) < 0 && z.compareTo(y) < 0 && y.compareTo(z) > 0 && z.compareTo(x) > 0)
   {
    result = x;
   }
   if(y.compareTo(x) < 0 && x.compareTo(z) < 0)
   {
    result = y;
   }
   if(y.compareTo(z) < 0 && z.compareTo(x) < 0)
   {
    result = y;
   }
   if(z.compareTo(x) < 0 && x.compareTo(y) < 0)
	{
	result = z;
	}
   if(z.compareTo(y) < 0 && y.compareTo(x) < 0)
    {
	result = z;
	}
  	return result;	
   }
   }
    
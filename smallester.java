import java.util.Scanner;

public class smallester
{
 public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
	  
   System.out.println("please enter an integer:");
   double x1 = in.nextDouble();
   
   System.out.println("please enter an integer:");
   double y1 = in.nextDouble();   
   
   System.out.println("please enter an integer:");
   double z1 = in.nextDouble();
   
   double z2 = smallest(x1, y1, z1);
   
   System.out.println("The smallest of the three integers is:"+z2);
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
  
  }	
}
    
    
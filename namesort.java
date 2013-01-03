import java.util.Scanner;

public class namesort
{
 public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
   
   System.out.println("Please enter a string:");
   String first = in.next();
   
   System.out.println("Please enter another string:");
   String second = in.next();
   
   System.out.println("Please enter one more string:");
   String third = in.next();
   
   if(first.compareTo(second) < 0 && second.compareTo(third) < 0 && third.compareTo(second) > 0 && second.compareTo(first) > 0)
   {
    System.out.println(first+second+third);   
   }
   if(first.compareTo(third) < 0 && third.compareTo(second) < 0 && second.compareTo(third) > 0 && third.compareTo(first) > 0)
   {
    System.out.println(first+third+second);
   }
   if(second.compareTo(first) < 0 && first.compareTo(third) < 0)
   {
    System.out.println(second+first+third);
   }
   if(second.compareTo(third) < 0 && third.compareTo(first) < 0)
   {
    System.out.println(second+third+first);
   }
   if(third.compareTo(first) < 0 && first.compareTo(second) < 0)
	{
	System.out.println(third+first+second);
	}
   if(third.compareTo(second) < 0 && second.compareTo(first) < 0)
    {
	System.out.println(third+second+first);
	}

	}
   }
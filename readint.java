import java.util.Scanner;

public class readint
{
 public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
	    System.out.print("Please enter integer: ");
        int number = in.nextInt();
	if (number > 0) 
	{
	 System.out.println("This integer is positive.");
	}
	if (number == 0)
	{
	 System.out.println("This integer is equal to zero.");
	}
    if (number < 0)
	{
	 System.out.println("This integer is negative.");
	}
	}
}
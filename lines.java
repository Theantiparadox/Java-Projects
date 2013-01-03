 import java.util.Scanner;

public class lines
{
public static void main (String[] args)
{
 Scanner in = new Scanner(System.in);
int q;
 System.out.println("please enter an integer:");
  while(!in.hasNextInt())
  {
    System.out.println("Not valid input, please try again:");
	in.next();
	}
    q = in.nextInt();
   while(q < 0 || q > 10)
    {
	 System.out.println("Not valid input, please try again:");
	}
int a;
a = ( q * 2 );

for (int b = 1; b <= a/2; b++)
{
for (int c = 1; c<= (a/2) -b; c++)
System.out.print (" ");
for (int d = 1; d <= (b*2) -1; d++)
System.out.print ("*");
System.out.println();}
for (int b = 2; b <= (a/2); b++)
{
for (int c = 1; c<= b -1; c++)
System.out.print (" ");
for (int d = 1; d <= a - (b*2) + 1; d++)
System.out.print ("*");
System.out.println();
}
}
}
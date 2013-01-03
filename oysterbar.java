import java.util.Scanner;

public class oysterbar
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  System.out.println("What is the current bar population density:");
  int barpop = in.nextInt();
  
  System.out.println("How many people entering bar:");
  int barent = in.nextInt();
  
  System.out.println("How many people are leaving the bar:");
  int barext = in.nextInt();
  
  int newbarpop;
  newbarpop = ( barpop + barent ) - barext;
	
  while( newbarpop < 100)
   {
	System.out.println("Current bar population is " + newbarpop);
	}
	System.out.println("Bar is full!");
	}
	}
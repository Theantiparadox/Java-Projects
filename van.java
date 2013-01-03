import java.util.Scanner;

public class van
{
 public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
   
    System.out.println("What is the positon of the left door dashboard button? 1 for on and 0 for off:");
	int leftdash = in.nextInt();
	
    System.out.println("What is the positon of the right door dashboard button? 1 for on and 0 for off:");
	int rightdash = in.nextInt();	
	
    System.out.println("What is the positon of the childlock dashboard button? 1 for on and 0 for off:");
	int child = in.nextInt();	
	
	System.out.println("Is the master lock active? Enter 1 for active, and 0 for inactive.");
    int maslock = in.nextInt();

    System.out.println("What is the positon of the left interior handle? 1 for on and 0 for off:");
	int insideleft = in.nextInt();
	
    System.out.println("What is the positon of the right interior handle? 1 for on and 0 for off:");
	int insideright = in.nextInt();	
	
    System.out.println("What is the positon of the left exterior handle? 1 for on and 0 for off:");
	int outsideleft = in.nextInt();

	System.out.println("What is the positon of the right exterior  handle? 1 for on and 0 for off:");
	int outsideright = in.nextInt();
	
	System.out.println("What gear is the car in?");
    String gearshift = in.next();
    
	if(maslock == 1 && gearshift.equals ("p"))
	 {
	  if(child == 1)
	  {
	   if(leftdash == 1 || outsideleft == 1)
	    {
		 System.out.println("left door opens.");
		}
	   if(rightdash == 1 || outsideright == 1)
	    {
		 System.out.println("right door opens");
		}
	  }
	  if(child == 0)
	  {
	  if(leftdash == 1 || outsideleft == 1)
	    {
		 System.out.println("left door opens.");
		}
	   if(rightdash == 1 || outsideright == 1)
	    {
		 System.out.println("right door opens");
	    } 
	   if(insideright == 1)
	    {
		 System.out.println("right door opens");
		}
	   if(insideleft == 1)
	    {
		 System.out.println("left door opens.");
		 }
	  }
	  }
	  else
	  {
	  System.out.println("Both doors stay closed");
      }
    }
}	
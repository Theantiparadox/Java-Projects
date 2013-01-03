import java.util.Scanner;

public class sumdiff
{
 public static void main(String[] args)
  {
   Scanner in = new Scanner(System.in);
   
   //First integer
   
   System.out.print("Please enter first integer: ");
   int num1 = in.nextInt();
   
   // Second integer
   
   System.out.print("Please enter second integer: ");
   int num2 = in.nextInt();
   //Shows sum of both integers
   int sum;
   sum = num1 + num2;
   System.out.println("The sum of the two integers is:" +sum);
   //Shows differance between two integers
   int diff;
   diff = num1 - num2;
   System.out.println("The diffrence of the two integers is:" +diff);
   
   int prod;
   prod = num1 * num2;
   System.out.println("The product of the two integers is:" +prod);
   
   int avg;
   avg = (num1 + num2) / 2;
   System.out.println("The average of the two integers is:" +avg);
   
   int abdiff;
   abdiff = Math.abs(diff);
   System.out.println("The absolute distance of the two integers is:" +abdiff);

   int max;
   max = Math.max(num1, num2);
   System.out.println("The larger of the two integers is:" +max);

   int min;
   min = Math.min(num1, num2);
   System.out.println("The smaller of the two integers is:" +min);
   }
}
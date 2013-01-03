public class perimeter
{
 public static void main(String[] args)
  {
   int l = 11;
   double w = 8.5;
   double perimeter;
   double diag;
   perimeter = (l + w) * 2;
   System.out.println("The Perimeter is " +perimeter);
   diag = Math.sqrt(l * l + w * w);
   System.out.println("The Diagonal measurement is " +diag);
   
   }
}
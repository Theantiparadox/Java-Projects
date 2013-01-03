import java.util.Scanner;

public class threedshapes
{
 public static double sphereVolume(double r)
 {
  double volume = (4 / 3) * 3.14 * (Math.pow(r,3));
  return volume;  
 }
 public static double sphereSurface(double r)
 {
  double surfar = 4 * 3.14 * (r * r);
  return surfar;
 }
 public static double cylinderVolume(double r, double h)
 {
  double volume = 3.14 * (r * r) * h;
  return volume;
 }
 public static double cylinderSurface(double r, double h)
 {
  double surfar = 2 * 3.14 * r * h;
  return surfar;
 }
 public static double coneVolume(double r, double h)
 {
  double volume = ((3.14 * (r * r)) * h )/ 3;
  return volume;
 }
 public static double coneSurface(double r, double h)
 {
  double surfar = 3.14 * r * Math.sqrt((r * r) * (h * h));
  return surfar;
 }
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Please enter a value for r:");
  double rVal = in.nextDouble();
  
  System.out.println("Please enter a value for h:");
  double hVal = in.nextDouble();
  
  double result1 = sphereVolume(rVal);
  
  double result2 = sphereSurface(rVal);
  
  double result3 = cylinderVolume(rVal, hVal);
  
  double result4 = cylinderSurface(rVal, hVal);
  
  double result5 = coneVolume(rVal, hVal);
  
  double result6 = coneSurface(rVal, hVal);
  System.out.println("Volume of sphere:" +result1);
  System.out.println("Surface of sphere:" +result2);
  System.out.println("Volume of cylinder:" +result3);
  System.out.println("Surface of cylinder:" +result4);
  System.out.println("Volume of cone:" +result5);
  System.out.println("Surface of cone:" +result6);
}  
}
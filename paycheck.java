import java.util.Scanner;

public class paycheck
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Name of employee:");
  String empname = in.next();
  
  System.out.println("Hourly rate:");
  double hourRate = in.nextDouble();
  
  System.out.println("Number of hours worked:");
  double hourWork = in.nextInt();
 
  double result1 = saLary(hourWork, hourRate);
 
  int result2 = (int)result1;
 
  System.out.println("Amount: " +result1);

  System.out.println(intName(result2) + " and " +((result1 - result2) * 100)+ "/100");
  
  System.out.println("To the order of: " +empname);
  }
 public static String intName(int number)
 {
  int part = number;
  String name = "";
  
  if(part >= 100)
  {
   name = digitName(part / 100) +"Hundred";
   part = part %100;
  }
  if(part >= 20)
  {
  name = name+" " +tensName(part);
  part = part % 10;
  }
  else if(part >= 10)
  {
   name = name +" " +teenName(part);
   part = 0;
  }
  if(part> 0)  
  {
  name = name + " " + digitName(part);
  }
  return name;
 }
 public static String digitName(int digit)
 {
  if(digit == 1){return "One" ;}
  if(digit == 2){return "Two" ;}
  if(digit == 3){return "Three" ;}
  if(digit == 4){return "Four" ;}
  if(digit == 5){return "Five" ;}
  if(digit == 6){return "Six" ;}
  if(digit == 7){return "Seven" ;}
  if(digit == 8){return "Eight" ;}
  if(digit == 9){return "Nine" ;}
  return "";
  }
   public static String teenName(int num)
 {
  if(num == 10){return "Ten" ;}
  if(num == 11){return "Eleven" ;}
  if(num == 12){return "Twelve" ;}
  if(num == 13){return "Thirteen" ;}
  if(num == 14){return "Fourteen" ;}
  if(num == 15){return "Fifteen" ;}
  if(num == 16){return "Sixteen" ;}
  if(num == 17){return "Seventeen" ;}
  if(num == 18){return "Eighteen" ;}
  if(num == 19){return "Nineteen" ;}
  return "";
  }
   public static String tensName(int num)
 {
  if(num >= 90){return "Ninety" ;}
  if(num >= 80){return "Eighty" ;}
  if(num >= 70){return "Seventy" ;}
  if(num >= 60){return "Sixty" ;}
  if(num >= 50){return "Fifty" ;}
  if(num >= 40){return "Fourty" ;}
  if(num >= 30){return "Thirty" ;}
  if(num >= 20){return "Twenty" ;}
  return "";
  }
 public static double saLary(double time, double pay)
 {
  double result;
  result = 0;
  if(time > 40)
   {
   double overTime = ((time - 40) * (pay * 1.5)) + (pay * 40);
   result = overTime;   
   }
  if(time <= 40)
  {
   double moneymade = time * pay;
   result = moneymade;
  }
  return result;
  }
  }
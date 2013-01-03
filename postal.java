import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Address
{
 private int zip;
 private String addy, street, city, state, apt;
 
 public boolean comesBefore(int zippy, int zippytwo)
 {
  if(zippy < zippytwo)
  {
   return true;
      //System.out.println("The first address would come first.");
  }
  return false;
  
  //System.out.println("The second address would come first.");
  
  }
 public void prnt()
 {
  System.out.println(addy+" "+apt+" "+street);
  System.out.println(city+" "+state+" "+zip);
  }
  public void prnt2()
 {
  System.out.println(addy+" "+street);
  System.out.println(city+" "+state+" "+zip);
 }
  //constructors

public Address(int a, String A, String B, String C, String D, String E) 
{ 
 a = zip;
 A = addy;
 B = street;
 C = city;
 D = state;
 E = apt;
}
public Address(int a, String A, String B, String C, String D)
{
 a = zip;
 A = addy;
 B = street;
 C = city;
 D = state;
}
}
class postal
{
 public static void main(String args[])throws IOException
 {
  BufferedReader in = new BufferedReader (new InputStreamReader(System.in)); 
  System.out.println("Is the residence a apartment? Y/N");
  String yorn = in.readLine();
  if(yorn.equals("y"))
  {  //first address
  Address first = new Address();
  System.out.print("please enter information about your addres\n\n");
  System.out.print("Please enter zip code:");
  int zip1 = Integer.parseInt(in.readLine() );
  System.out.print("Enter house number:");
  String husnumb = in.readLine();
  System.out.print("Enter apartment number:");
  String aparnumb = in.readLine();
  System.out.print("Enter street number:");
  String strtnumb = in.readLine();
  System.out.print("Enter City:");
  String cityname = in.readLine();
  System.out.print("Enter State:");
  String streetname = in.readLine();
  first.Address(zip1,husnumb,aparnumb,strtnumb,cityname,streetname);
  System.out.println();
  
  //second address
  Address second = new Address();
  System.out.print("please enter information about your addres\n\n");
  System.out.print("Please enter zip code:");
  int zip2 = Integer.parseInt(in.readLine() );
  System.out.print("Enter house number:");
  String husnumb2 = in.readLine();
  System.out.print("Enter apartment number:");
  String aparnumb2 = in.readLine();
  System.out.print("Enter street number:");
  String strtnumb2 = in.readLine();
  System.out.print("Enter City:");
  String cityname2 = in.readLine();
  System.out.print("Enter State:");
  String streetname2 = in.readLine();
  second.Address(zip2,husnumb2,aparnumb2,strtnumb2,cityname2,streetname2);
  System.out.println();
  first.prnt();
  System.out.println();
  second.prnt();
  
  Address third = new Address();
  third.comesBefore(zip1,zip2);
   }
  if(yorn.equals("n"))
  {
  Address fourth = new Address();
  System.out.print("please enter information about your addres\n\n");
  System.out.print("Please enter zip code:");
  int zip3 = Integer.parseInt(in.readLine() );
  System.out.print("Enter house number:");
  String husnumb3 = in.readLine();
  System.out.print("Enter street number:");
  String strtnumb3 = in.readLine();
  System.out.print("Enter City:");
  String cityname3 = in.readLine();
  System.out.print("Enter State:");
  String streetname3 = in.readLine();
  fourth.Address(zip3,husnumb3,strtnumb3,cityname3,streetname3);
  System.out.println();
  
  Address fifth = new Address();
  System.out.print("please enter information about your addres\n\n");
  System.out.print("Please enter zip code:");
  int zip4 = Integer.parseInt(in.readLine() );
  System.out.print("Enter house number:");
  String husnumb4 = in.readLine();
  System.out.print("Enter street number:");
  String strtnumb4 = in.readLine();
  System.out.print("Enter City:");
  String cityname4 = in.readLine();
  System.out.print("Enter State:");
  String streetname4 = in.readLine();
  fifth.Address(zip4,husnumb4,strtnumb4,cityname4,streetname4);
  System.out.println();
  fourth.prnt2();
  System.out.println();
  fifth.prnt2();
  
  Address sixth = new Address();
  sixth.comesBefore(zip3,zip4);
  }
} 
} 

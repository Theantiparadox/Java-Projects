import java.io.File;
import java.text.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class website
{
 public static void main(String[] args)throws IOException
  {
   
   Scanner in = new Scanner(System.in);
   System.out.print("Website address:");
   String address = in.next();
   URL pageLocation = new URL(address);
   Scanner urel = new Scanner(pageLocation.openStream());
   
   System.out.print("Output File:");
   String outputFileName = in.next();
   try
   {
   PrintWriter out = new PrintWriter(outputFileName);
   try
   {
   out.println(urel);
   }
   finally
   {
   out.close();
   }
   }
   catch(IOException exception)
   {
   System.out.println("Unable to execute ");
   }
   catch(MalformedURLException e)
   {
      System.out.println("Unable to execute ");    
   }
}
 }
   

// import java.io.*;
import java.util.Scanner;
class Main
{
 
 public static void main(String[] args)
 {
 Scanner input = new Scanner (System.in);
  if (input.hasNextInt())
   System.out.println("This input is of type Integer.");
   
   else if (input.hasNextFloat())
  System.out.println("This input is of type Float.");
   
  else if (input.hasNextLine())
  System.out.println("This input is of type string."); 
   
  else if (input.hasNextDouble()) 
  System.out.println("This input is of type Double."); 
   
  else if (input.hasNextBoolean())
   System.out.println("This input is of type Boolean.");  
   
  else if (input.hasNextLong())
    System.out.println("This input is of type Long."); 
 }
}
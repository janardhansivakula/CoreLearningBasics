//write a java programme which will illustrate the concept of THROWS keyword.
//ThrowsEx1.java 
 import java.util.Scanner;
 class ThrowsEx1
 {
  public static void main(String []args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("-----------------");
   System.out.println("Enter your marks");
   String s=sc.nextLine();  
   
   try
   {
    float marks=Float.parseFloat(s);
    System.out.println("-------------------");
    System.out.println("your marks=" +marks);
    System.out.println("-------------------");
   }
   catch(NumberFormatException nfe)
   {
    System.out.println("Please Don't enter alpha numerical values to marks");
   }
  }
 }
//Write a java programme which makes us of Div() of sp.Sathya class and handle  the appropriate exception if required.

//ThrowsEx2.java
 
 import sp.Sathya;
 import java.util.Scanner;
 
 class ThrowsEx2
 {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two values");
    
    String a=sc.nextLine();
    String b=sc.nextLine();
    
    Sathya so = new Sathya();
    
    try
    {
      so.Div(a,b);
    }catch(ArithmeticException ae)
     {
       System.out.println("--------------------------------");
       System.out.println("Don't enter zero for denominator");
     }
     catch(NumberFormatException nfe)
     {
       System.out.println("-----------------------------------------");
       System.out.println("please don't enter alpha numerical values");
     }
     finally
     {
       System.out.println("============================================");
       System.out.println("whatever it may be i'll executed deffinately");
       System.out.println("Iam from finally block ");
       System.out.println("============================================");
     }
       
       System.out.println("----------------------"); 
  }  
 }
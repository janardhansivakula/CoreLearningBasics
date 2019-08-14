//Write a main programme.

//ThrowEx1.java

 import sp1.Sathya10;
 import java.util.Scanner;

 class ThrowEx1
 {
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("**********************");
    System.out.println("Enter First value of a");
      int a=Integer.parseInt(sc.nextLine());
   
    System.out.println("***********************");
    System.out.println("Enter second value of b"); 
      int b=Integer.parseInt(sc.nextLine());

     Sathya10 s10 = new Sathya10();
    
     try
     {
         s10.Div(a,b);
     
     }
     catch(ArithmeticException ae)
     {
      System.out.println(ae);
     }   
      
    finally
    {
      System.out.println("*************************");
      System.out.println("Iam from finally block");      
      System.out.println("*************************");
    }
   }
  }
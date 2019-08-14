//write a java programme decide the output of the following programme.

//Exam2.java

 class Exam2
 {
   public static void main(String []args)
   {
    try
    {
     System.out.println("==============");
     System.out.println("SATHYA");
     System.out.println("==============");
       int c=100/0;
     System.out.println("Value of C=" +c);
    }/*catch(ArithmeticException ae)
     {
      System.out.println("******************************************");
      System.out.println("Please Don't Enter zero(0) for denominator");
      System.out.println("******************************************");
     }*/
    finally
    {
     System.out.println("----------------------");
     System.out.println("Iam from finally block");
     System.out.println("----------------------");
    }
     System.out.println("~~~~~~~~~~~~~~~~~~~~~");
     System.out.println("TELANGANA STATE");
     System.out.println("HYDERABAD CITY");
     System.out.println("MOOSAPET AREA");
     System.out.println("~~~~~~~~~~~~~~~~~~~~~");
   }
 }
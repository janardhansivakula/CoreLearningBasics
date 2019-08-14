//Write a java programme which will re create an object of exception sub class.

//Sathya10.java

 package sp1;
 
 public class Sathya10
 {
   public void Div(int a,int b) throws ArithmeticException
   {
    if(b==0)
    {
      ArithmeticException ae = new ArithmeticException("Don't enter zero(0) for denominator");
         
          throw ae;
    }
    else
    {
      int c=a/b;
      System.out.println("---------------------");
      System.out.println("Value of division=" +c);
       System.out.println("--------------------");
    }
   }
 }

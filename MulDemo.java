//Write a main java programme which makes use of table() op mp.Mul

//MulDemo.java
 
 import mp.Mul;
 class MulDemo
 {
   public static void main(String []args)
   {
    System.out.println("------------------------------------------------------");
    System.out.println("from main() we are created an object of mp.Mul package");
   
          Mul ml = new Mul();
           

         try
         {
           ml.MulTable();
         }catch(NumberFormatException nfe)
          {
           System.out.println("---------------------------------");
           System.out.println("Don't enter alpha numrical values");
          }
          finally
          {
           System.out.println("======================");
           System.out.println("IAM FROM FINALLY BLOCK");
           System.out.println("======================");
          }
   





   }
 }
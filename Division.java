//EXCEPTION HANDLING

//Write a java programme and handle the appropriate exception.

//Division.java
 
 class Division
 {
   public static void main(String args[])
   {
     try
     {
      String s1=args[0];
      String s2=args[1];
      
      int x1=Integer.parseInt(s1);
      int x2=Integer.parseInt(s2);
       
         int x3=x1-x2;
      System.out.println("************************");
      System.out.println("Value of a substraction=" +x3);
      System.out.println("************************");
     }
      
      catch(ArithmeticException ae)
      {
       System.out.println("-----------------------------------");
       System.out.println("Don't Enter zero(0) for denominator");
       System.out.println("-----------------------------------");
      }
      catch(NumberFormatException nfe)
      {
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("Don't Enter Alpha numerical values");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      }    
      catch(ArrayIndexOutOfBoundsException aiobe)
      {
       System.out.println("************************************");
       System.out.println("Please Enter Two values");
       System.out.println("************************************");
      }

      finally
      {
       System.out.println("====================================");
       System.out.println("Iam from finally block");
       System.out.println("====================================");
      }
    }
  }
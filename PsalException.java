//Develop a programmer defined exception sub class for dealing with positive salary of an employee.

//PsalException.java

 package Sathay.lang;

 public class PsalException extends RuntimeException
 {
   public PsalException(String s)
   {
     super(s);
   }
 }
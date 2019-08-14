//Define exception sub class for dealing with negative salary of an employee.

//NsalException.java

 package Sathya.lang;

 public class NsalException extends RuntimeException
 {
   public NsalException(String s)
   {
     super(s);
   }
 }
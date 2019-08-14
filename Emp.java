//develop a programmer defined common class which will check the salary of each and every employee and generate the if required.

//Emp.java

 package org.igate;
 import Sathya.lang.NsalException;
 import Sathya.lang.PsalException; 

 public class Emp
 {
  public void checkSal(String esal) throws NsalException,PsalException,NumberFormatException
  {
   int sal=Integer.parseInt(esal);

    if(sal<=0)
    {
      NsalException nse = new NsalException("Invalid Salary,plz enter valid salary");
          throw nse;

              
    }
  }
 }
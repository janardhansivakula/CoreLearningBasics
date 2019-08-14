//Write a java programme which will illustrate the concept of THROWS keyword which is used as a part of programme defined method.\

//Sathya.java
 
 package sp;

 public class Sathya
 {
  public void Div(String a,String b)throws NumberFormatException,ArithmeticException
  {
    float x1=Float.parseFloat(a);
    float x2=Float.parseFloat(b);

       float x3=x1/x2;
    System.out.println("---------------------------");
    System.out.println("Div of value in Sathya=" +x3);
    System.out.println("---------------------------"); 
  }  
 }
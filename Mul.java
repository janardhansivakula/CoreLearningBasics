//Write a java programme which will generate the multiplication table by considering all types of exceptions and handle those exceptions.

//Mul.java

    package mp;
 import java.util.Scanner;
 
 public class Mul
 {
   public void MulTable()
   {
     System.out.println("=======================================");
     System.out.println("Enter a number for multiplication table");
      Scanner sc = new Scanner(System.in);
    
       int n1=Integer.parseInt(sc.nextLine());
     System.out.println("=============================");
     System.out.println("multiplication table for:" +n1);

       if(n1<=0)
       {
        System.out.println("-----------------------------------------------------------");
        System.out.println(n1+ "is a invalid input, please enter o+ value for mul table");
       }
       else
       {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");         
        System.out.println("Multiplication table for=" +n1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    
            for(int i=1; i<=10; i++)
            {
              System.out.println("-----------");
              System.out.println(n1+"*"+i+"=" +(n1*i));
              //System.out.println("------------------");
            } 
      }   
    }
  }
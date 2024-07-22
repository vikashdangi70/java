

/*Write a function which takes in 2 numbers and returns the greater of those two.  */


import java.util.*;
  public class graternousingFunction {

     public static int grater(int a ,int b){
         if (a<2){
             return a;

         }else {
             return b;
         }
     }
     public static void main(String args[]){
         Scanner sc= new Scanner (System.in );
         System.out.print("Enter your first number:- ");
         int a=sc.nextInt();
         System.out.print("Enter your second number:- ");
         int b=sc.nextInt();

         System.out.println("the grater no. in between a and b is "+grater(a,b));
     }
}

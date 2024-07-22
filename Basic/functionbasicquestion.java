
/*make a function to add 2 no.and return the sum*/

import java.util.*;
   public class functionbasicquestion {
       public static int calculate (int a,int b){
           int sum=a+b;
           return sum;
       }
       public static void main(String args[]){
           Scanner sc = new Scanner (System.in);

           System.out.print("Enter Your First Number:- ");
           int a =sc.nextInt();
           System.out.print("Enter Your Second Number:- ");
           int b = sc.nextInt();
           System.out.print("The sum of two no.is :- ");
           int sum=calculate(a,b);
           System.out.println(sum);
       }
}

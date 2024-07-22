    /* Enters 3 numbers from the users and make a function to print their average */
    //code:-
           import java.util.*;
            public class Ex_First_QUE_First {
                public static int avgrage(int a,int  b,int c){

                    return (a+b+c)/3;        //note point of this code are its small () brackets
                }
                 public static void main(String args[]){
                    Scanner sc=new Scanner (System.in);
                     System.out.println("Welcome to avrage calculator");

                     System.out.print("Please enter your first number:-");
                      int a=sc.nextInt();
                     System.out.print("Please enter your second number:-");
                      int b=sc.nextInt();
                     System.out.print("Please enter your third number:-");
                      int c= sc.nextInt();

                     System.out.println("The avrage of three number which you have entered is : "+avgrage(a,b,c));



                 }
            }

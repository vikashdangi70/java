import java.util.*;
  public class secondELSEIF {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
               System.out.println("Enter the value of a");
            int a =sc.nextInt();
               System.out.println("Enter the value of b");
            int b=sc.nextInt();


            if (a==b){
                System.out.println("Condition is same");
            }else if(a>b){
                System.out.println("a is grater");
            }else if (a<b){
                System.out.println("a is lesser ");
            }

    }
  }

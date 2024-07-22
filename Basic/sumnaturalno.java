/*print the sum of first n natural no.(taking input from the user)*/
    import java.util.*;
       public class sumnaturalno{
           public static void main(String[] args){
               Scanner sc = new Scanner (System.in);
               System.out.println("enter any number");
               int n=sc.nextInt();
               int sum=0;
                 for (int i=0;i<=n;i++){
                     sum=sum+i;
                 }
               System.out.println(sum);
           }

       }

import java.util.*;
 public class dimond_or_kitte_pattern {
     public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         System.out.println("Written by VIKASH DANGI ");
         System.out.print("Enter Row No.:- ");


          int R=sc.nextInt();
                //upper half
          for (int i=1;i<=R;i++){
                   //spaces
              for (int j=1;j<=R-i;j++){
                  System.out.print(" ");
              }
                  //Stars
              for (int j= 1;j<=2*i-1;j++){
                  System.out.print("*");
              }
              System.out.println();
          }
          //lower half

         for (int i=R;i>=1;i--){
             //spaces
             for (int j=1;j<=R-i;j++){
                 System.out.print(" ");
             }
             //Stars
             for (int j= 1;j<=2*i-1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }


     }
}

import java.util.*;
  public class butterflypattern {
      public static void main (String[] args){
           Scanner sc = new Scanner (System.in);
          System.out.println("This Code Is Written By VIKASH DANGI");
          System.out.print("Please Enter Row No.:-");
              int V= sc.nextInt();

              for (int i =1;i<=V;i++){
                  for (int j=1;j<=i;j++){
                      System.out.print("*");
                  }
                  int spaces=2*(V-i);                   /*middle spaces */
                    for (int j =1;j<=spaces;j++){
                        System.out.print(" ");
                    }
                    for (int j= 1;j<=i;j++){       /*  90degree rotate pyramid*/
                        System.out.print("*");
                    }
                  System.out.println();
              }

                     //LOWER PART

                 for (int i=V;i>=1;i--){           /*only this line have changed remaining code always same */
                     for (int j=1;j<=i;j++){

                         System.out.print("*");
                     }
                     int spaces=2*(V-i);
                     for (int j =1;j<=spaces;j++){
                         System.out.print(" ");
                     }
                     for (int j= 1;j<=i;j++){
                         System.out.print("*");
                     }
                     System.out.println();
                 }
                 }

                     }





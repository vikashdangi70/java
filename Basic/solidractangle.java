import java.util.*;
    public class solidractangle {
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the rows : ");
              int r = sc.nextInt();
            System.out.println("enter the coloumns : ");
              int c = sc.nextInt();
              for (int i=1;i<=r;i++){
                  for (int j=2;j<=c;j++)  /* j start with 2 because counting  2se hogi if 1 se start krte to jitna input dete usse ek jada line
                                            print hoti */
                  {
                      System.out.print("*");  /*print ke saath ln isliye nahin liya because ln agr lete to hr star next line me
                                               jata or horizontal ki jagah varticly print hota */
                  }
                  System.out.println("*");
              }
        }
}

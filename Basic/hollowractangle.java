import java.util.*;
  public class hollowractangle {
      public static void main(String[] args){

          Scanner sc = new Scanner(System.in);
          System.out.println("enter the value of c");
          int c=sc.nextInt();
          System.out.println("enter the value of r ");
          int r= sc.nextInt();

            for(int i=1;i<=c;i++){
                for(int j =1;j<=r;j++) {
                    if (i == 1 || j == 1 || i == c || j == r) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

      }
}

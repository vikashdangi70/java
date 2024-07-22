import java.util.*;
  public class circumfranceofcirclefunction {
      public static double radius(double a){
          return 2*3.14*a;

      }
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the value of radius:-");
          int a = sc.nextInt();
          System.out.println(radius(a));
      }
}

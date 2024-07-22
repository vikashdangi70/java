import java.util.*;
  public class evenodd {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any integer number ");
          int number = sc.nextInt();
            if (number%2==0){
                System.out.println("The integer you have to entered,is EVEN");

            }else {
                System.out.println("The integer you have to entered,is ODD");
            }
      }
}

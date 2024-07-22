import java.util.*;
  public class ifelsestatement {
      public static void main (String[] args){
          Scanner sc = new Scanner(System.in);
              System.out.println("Enter your age");
          int age=sc.nextInt();
            if(age>=18){
                System.out.println("YOUR ADULT");
            }
            else{
                System.out.println("YOUR NOT ADULT");
            }
      }
}

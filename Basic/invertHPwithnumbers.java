import java.util.*;
  public class invertHPwithnumbers {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Rows: ");
          int r = sc.nextInt();
          for (int i=r;i>=1;i--){
              for (int j=1;j<=i;j++){
                  System.out.print(j+"");
              }
              System.out.println();
          }
    }

  }

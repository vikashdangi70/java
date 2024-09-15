import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();

        boolean isPrime = true;

          for (int i=2; i<=n; i++){

              if (n % i ==0){                   //n is multiple of i (n is not equal 1 or n)
                  isPrime= false;
              }
          }


          if (isPrime==true){
              System.out.println("Prime number");
          }
          else{
              System.out.println("Not Prime Number");
          }

    }
}

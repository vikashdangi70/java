// In This Program I have store reverse in rev variable
import java.util.*;
public class Reverse_of_a_number_store {
        public static void main(String[] args){
            System.out.println("This code is written by Vikash Dangi");
            System.out.print("Enter Your Number :");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int rev =0;
            while (n>0){
                int lastdigit= n%10;
                rev = (rev*10)+ lastdigit;
                n=n/10;
            }
            System.out.print(rev);
        }
}

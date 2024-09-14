//In This Program I have not store reverse and directly print the reverse value
import java.util.*;
public class Reverse_of_a_Number {
    public static void main(String[] args){
        System.out.println("This code is written by Vikash Dangi");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number");
        int number =sc.nextInt();

        while(number>0){
            int lastdigit= number%10;
            System.out.print(lastdigit);
            number=number/10;
        }
    }
}

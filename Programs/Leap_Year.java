import java.util.*;
public class Leap_Year {
    public static void main(String[] args){
        System.out.println("This code is written by Vikash Dangi");
        System.out.print("Enter Year");
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 100==0 && year%400==0 || year%100!=0 && year% 4==0){
            System.out.print("Leap Year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}

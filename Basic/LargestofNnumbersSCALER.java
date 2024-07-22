import java.util.*;
   public class LargestofNnumbersSCALER {
       public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           int a = sc.nextInt();
           int maxValue=Integer.MIN_VALUE;

             for (int i=1;i<=a;i++){
                 int current =sc.nextInt();
                 maxValue=Math.max(maxValue,current);}
           System.out.println(maxValue);

             }
       }



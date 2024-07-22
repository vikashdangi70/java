/*print the table of a number i/p by the user*/
   import java.util.*;
       public class Table {
           public static void main(String[] args){
               Scanner sc = new Scanner(System.in);
               System.out.println("enter any number which table do u need");
                int n = sc.nextInt();
                for (int i=1; i <11;i++){
                    System.out.println(i*n);
                }
           }
       }

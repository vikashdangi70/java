import java.util.*;
 public class function {
    public static void printMyname(String name) {     /* declear the function*/
        System.out.println(name);                    /* declear the function*/
      return  ;                                     /* declear the function*/
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please Enter Your Name :- ");
         String name =sc.nextLine();


         printMyname(name);                 //function ko call kiya
    }
}

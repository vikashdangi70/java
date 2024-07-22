
             /*  FIND THE FACTORIAL OF A NUMBER */
             import java.util.*;
                public class fun_factorialofano {
                    public static void factorial(int a){
                        int fact=1;
                        for (int i=a;i>=1;i--){
                            fact=fact*i; //agar yaha i ki jagah a likte to jitni value i/p me dete usi value ka utni hi baar multiply hota
                        }
                        System.out.println(fact);
                        return ;
                    }
                    public static void main(String args[]){
                        Scanner sc=new Scanner(System.in);
                        System.out.print("Enter any Number :- ");
                        int a=sc.nextInt();

                        factorial(a);

                    }
}

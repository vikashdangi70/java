import java.util.*;

 public class hackerrankifelse {

        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            int n =sc.nextInt();
            if(n%3==0){
                System.out.println("Weird");
            }else if(n%2==0 && n<=5 && n>=2){
                System.out.println("Not Weird");
            }

                else if(n%2==0 && n>=6 && n<=20){
                    System.out.println("Weird");
                }else{
                    if (n>=20){
                    System.out.println("Not Weird");

                }
            }
        }
    }


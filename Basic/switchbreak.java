import java.util.*;
  public class switchbreak {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("please enter any key");
           int button=sc.nextInt();
           switch(button){
               case 1 :
                   System.out.println("Hello");
                   break;
               case 2:
                   System.out.println("namaste");
                   break;
               case 3:
                   System.out.println("vikku");
                   break;
               default:
                   System.out.println("invalid");
           }

    }
  }

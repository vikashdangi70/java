import java.util.*;
public class A_Conditional_statement {
//    public static void main(String args[]){
//
//    Scanner sc = new Scanner (System.in);
//        System.out.print("Enter your income : ");
//    int income = sc.nextInt();
//    if (income <500000){
//        System.out.println("You have to pay 0% tax");
//    }
//    else if (income >=500000 && income <1000000){
//        System.out.println("You have to pay 20% tax which is" +income *0.2);
//    }
//    else {
//        System.out.println("You have to pay 30% tax which is" +income * 0.3);
//    }
//    }
//}


    //                                      Print the largest of three numbers

//public static void main(String args[]){
//    Scanner sc = new Scanner(System.in );
//    System.out.print("a = ");
//    int a = sc.nextInt();
//    System.out.print("b = ");
//    int b = sc.nextInt();
//    System.out.print("c = ");
//    int c = sc.nextInt();
//    if (a>=b && a>=c){
//        System.out.print("A is greater");
//    }
//    else if (b>=c){
//        System.out.print("B is greater");
//    }
//    else{
//        System.out.println("c is greater");
//    }
//}
//}

//                                       teranary Operator

//public static void main(String args[]){
//Scanner sc = new Scanner (System.in);
//    System.out.println("Number = ");
//double number = sc.nextDouble();
////ternary operator
//    String type = (number%2==0)?"even":"odd";
//    System.out.println(type);
//}
//}
                                //    Check if a student pass or fail with the help of ternary operator

//public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//            System.out.print("Enter your marks : ");
//            int marks = sc.nextInt();
//
//        String reportCard =  marks >= 33 ?"Pass":"Fail";
//            System.out.println(reportCard);
//}
//}
//                              Switch break Statement

//public static void main(String[] args){
//      Scanner sc = new Scanner (System.in);
//      int num = sc.nextInt();
//       switch (num){
//           case 1 :
//               System.out.println("Samosa");
//               break;
//           case 2 :
//               System.out.println("mango shake");
//               break;
//           case 3:
//               System.out.println("cold cofee");
//               break;
//           default:
//               System.out.println("Kya bhai Sapne raat me dekha kare");
//
//
//       }
//}
//}


//                               make calculator with the help of switch and break statement
//public static void main(String [] args){
//Scanner sc = new Scanner (System.in);
//    System.out.print("A = ");
//int a = sc.nextInt();
//    System.out.print("B = ");
//int b = sc.nextInt();
//    System.out.println("Enter operator");
//char operator = sc.next().charAt(0);
//switch (operator) {
//    case '+' :
//        System.out.println(a+b);
//        break;
//    case '-':
//        System.out.println(a-b);
//        break;
//    case '*':
//        System.out.println(a*b);
//        break;
//    case'%':
//        System.out.println(a%b);
//        break;
//    case '/':
//        System.out.println(a/b);
//        break;
//    default:
//        System.out.println("wrong input");
//
//    }
//}
//}


//                                     Assignment


//Question1: Write a Java program to get a number from the user and print whether it is positive or negative.

//public static void main(String[] args){
//        Scanner sc= new Scanner (System.in);
//        System.out.println("enter a number ");
//        int a = sc.nextInt();
//        if (a >=0){
//                System.out.println("positive number");
//        }
//        else {
//                System.out.println("negative number");
//        }
//
//}
//}

//Question2: Finish the following code so that it prints You have a fever if your temperature
// is above 100 and otherwise prints You don't have a fever.

//public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter yor body temperature : ");
//        double temp= sc.nextDouble();
//
////        double temp = 103.5;
//        if (temp >= 100){
//                System.out.println("you have a fever");
//        }
//        else{
//                System.out.println("You dont have fever");
//        }
//
//}}


 //       Question3: Write a Java program to input week number (1-7) and print day of week name using switch case

//public static void main(String[] args){
//            Scanner sc =new Scanner (System.in);
//        System.out.println("enter any number b/w 1 to 7");
//            int day =sc.nextInt();
//            switch (day){
//
//                    case 1 :
//                            System.out.println("Monday");
//                            break;
//                    case 2:
//                            System.out.println("Tuesday");
//                            break;
//                    case 3 :
//                            System.out.println("Wednesday");
//                            break;
//                    case 4 :
//                            System.out.println("Thursday");
//                            break;
//                    case 5 :
//                            System.out.println("Friday");
//                            break;
//                    case 6 :
//                            System.out.println("Saturday");
//                            break;
//                    case 7 :
//                            System.out.println("Sunday");
//                            break;
//                    default:
//                            System.out.println("limit exceed");
//            }
//
//}
//}

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean x =(year%4)==0;
        boolean y =(year%100)!=0;
        boolean z = ((year%100==0) && (year % 400==0));
        if (x && (y || z)){
                System.out.println(year + "leap year ");
        }
        else {
                System.out.println(year+" not a leap year");
        }

}
}
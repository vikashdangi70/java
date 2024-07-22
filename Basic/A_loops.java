import java.util.*;
public class A_loops {
//    public static void main(String[] args){
//        int counter =0 ;
//        while (counter<10){
//            System.out.println("hello vikash");
//                counter++;
//        }
//        System.out.println("printed 10x timex");
//    }
//}


//             print number 1 to 10 using while loop

//public static void main(String[] args){
//        int number =1;
//        while(number <=10){
//            System.out.print(number+ " ");   // "" sirf digit k beech space print karne k liye lgaye h
//            number= number + 1;
//        }
//    System.out.println();                 //ye sirf next line k liye
//}
//}


//             print numbers 1 to n,  value of n is taking from user

//public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//   System.out.println("Enter the value of n ");
//   int n = sc.nextInt();
//   int a = 1;
//   while (a<=n){
//      System.out.println(a);
//      a=a+1;
//   }
//
//}
//}

//            print sum of n natural numbers

//public static void main(String[] args){
//  Scanner sc = new Scanner (System.in);
//  int n = sc.nextInt();
//  int sum = 0;
//  int i=1;
//  while( i<=n){
//     sum = sum+i;     // sum = sum + i ya sum += i dono tareeke se likh sakte hain
//     i++;
//  }
//   System.out.println(sum);
//}
//}


//                                 FOR LOOP QUESTIONS

//             Print square pattern with the help of for loop
//
//public static void main(String [] args) {
//    int r = 4;
//    for (int i = 0; i <= r; i++) {
//        System.out.println("****");
//
//    }
//}
//}


//            print reverse of a number
//public static void main(String[] args){
//Scanner sc = new Scanner (System.in);
//int n = sc.nextInt();
//while (n>0) {
//    int lastDigit = n % 10;
//    System.out.print(lastDigit + " ");
//    n = n / 10;
//}
//}
//}

//                        break statement question

//que.             keep entering numbers till user enters a multiple of 10

//public static void main(String[] args){
//  Scanner sc = new Scanner (System.in);
//  do {
//      System.out.println("Enter your number");
//      int a = sc.nextInt();
//      if (a % 10 == 0) {
//          break;
//      }
//      System.out.print(a);
//  }while(true);
//}
//}

//             continue statement -it is used to skip the iteration

//que.-   1 se 5 tk print kana hai or 3 ko hide krna hai with the help of continue statement

//public static void main(String[] args){
////Scanner sc = new Scanner (System.in);
//    int i=1;
//for (i=1;i<=5;i++){
//    if (i==3){
//        continue;
//    }
//    System.out.println(i);
//
//}
//}
//}

//            display all numbers entered by user except multiples of 10

//public static void main(String[] args){
//Scanner sc= new Scanner (System.in);
//do {
//    System.out.print("ENter your number : ");
//    int a = sc.nextInt();
//
//    if (a%10==0){
//        continue;
//    }
//    System.out.println("number was " +a);
//
//}while (true);
//
//}
//}


// above program me if number is multiple of 10 hai to kuch v  print nahin hoga /


//que.=                           Check if number is prime or not


//public static void main(String [] args){
//Scanner sc = new Scanner(System.in);
//      int a= sc.nextInt();
//
//      boolean isPrime = true;
//      int i;
//
//      for (i=2;i<=a-1;i++){
//            if (a%i==0){
//                  isPrime=false;
//            }
//      }
//      if (isPrime == true){
//            System.out.println("prime");
//      }
//      else{
//            System.out.println("not prime");
//      }
//
//      }
//}


//                                              Assignment

    // Question2: Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

//public static void main(String[] args){
//     Scanner sc = new Scanner (System.in);
//     int num;
//     int choice;
//     int evensum=0;
//     int oddsum=0;
//     do {
//           System.out.println("enter number");
//           num = sc.nextInt();
//           if (num % 2 == 0) {
//                 evensum = evensum + num;
//           }
//           else {
//                 oddsum += num;
//           }
//           System.out.print("do u want to continue press 1 for yes and 2 for no");
//           choice =sc.nextInt();
//     }while(choice == 1);
//      System.out.println(evensum);
//      System.out.println(oddsum);
//}
//}
}

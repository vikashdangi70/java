import java.util.*;
public class A_FunctionANDmethod {


//    public static void printh(){    //this is a function
//        System.out.println("Hii");
//
//        System.out.println("Hii");
//
//        System.out.println("Hii");
//        return;
//    }
//    // calculateSum function
//    public static void calculateSum(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your First Number : ");
//        int a = sc.nextInt();
//        System.out.print("Enter Your Second Number : ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.print("Sum is : "+sum);
//  }
//    public static void main(String args[]){
////        printh();     // This is function call
//       calculateSum();
//   }
//
//}

    // calculateSum function
//    public static void calculateSum(int a ,int b)  //function ke andar jo bhi input aata hai use parameter kahte hain
//                                                  // yaha par a aur b input the jo ki parameter ki jagah par bhi define kar diye hain
//    {
//        int sum = a+b;
//        System.out.print("Sum is : "+sum);
//    }
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your First Number : ");
//        int a = sc.nextInt();
//        System.out.print("Enter Your Second Number : ");
//        int b = sc.nextInt();
//
//        calculateSum(a,b);           // a,b isliye diya hai kyuki ye function k actual parameter/arguments hain or hme inka hi sum chaiye hai function se.
//    }}


//                                               Find product of a & b

//public static int calculateProduct(int a ,int b){
//        int product = a*b;
//    System.out.println("product is : "+product);
//    return product;
//}
//public static void main(String[] args){
//    Scanner sc = new Scanner (System.in);
//    System.out.println("Enter a : ");
//    int a = sc.nextInt();
//    System.out.println("Enter b : ");
//    int b = sc.nextInt();
//    calculateProduct(a,b);
//
//}
//}


//                                        FInd factorial of a Number N

//

//
//    public static int factorial(int n ){
//        int f = 1;
//        for (int i=1;i<=n;i++){
//            f=f*i;
//
//        }
//        return f;
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value of n ");
//        int n = sc.nextInt();
//        // factorial(n);
//        System.out.println((factorial(n)));
//    }
//}


    //                                     binomial Coefficient of numbers


//    public static int factorial(int n ){
//        int f = 1;
//        for (int i=1;i<=n;i++){
//            f=f*i;
//        }
//        return f;
//    }
//    public static int binCof(int n,int r) {
//        int fact_n = factorial(n);        //this is work as n
//        int fact_r = factorial(r);       //this is work as r
//        int d = factorial(n-r); // this is work as n-r
//
//        int binCof=fact_n/(fact_r*d);
////        System.out.println("The binomial coefficient is : " + binomialC);
//        return  binCof;
//    }
//
//    public static void main(String[] args){
//
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter the value of n ");
////        int n = sc.nextInt();
////        int r =sc.nextInt();
//        System.out.println(binCof(5,2));
////        // factorial(n);
////        System.out.println((factorial(n)));
//    }}
//
//
////    public static int binomialCoefficient(int n,int c) {
////        int a = factorial(n);        //this is work as n
////        int b = factorial(c);       //this is work as r
////        int d = factorial(a - b); // this is work as n-r
////        System.out.println("The binomial coefficient is : " +(a)/(b*d));
////
////    }}


//                                      Check if number is prime or not

//public static boolean isPrime(int n){
//   boolean isPrime=true;
//   for (int i = 2 ; i<=n-1; i++){
//
//       if (n%i==0){
//           isPrime= false;
//           break;
//       }
//   }
//   return isPrime;
//}
//public static void main(String[] args){
//    System.out.println(isPrime(5));
//}
//}

    //                                  Check Prime numbers b/w some range


//    public static boolean isPrime(int n) {
//        boolean isPrime = true;
//        for (int i = 2; i <= n - 1; i++) {
//
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }
//
//    public static void primeInrange(int n) {
//        for (int i = 2; i <= n; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        primeInrange(16);
//    }
//}
//


//                                          Binary to Decimal conversion

//    public static void binTodec(int binNum) {
//
//        int myNum = binNum;
//        int pow = 0;
//        int decNum = 0;
//
//        while (binNum > 0) {
//            int lastDigit = binNum % 10;
//            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
//            pow++;
//            binNum = binNum / 10;
//        }
//        System.out.println("decimal of " + myNum + "=" + decNum);
//
//    }
//
//    public static void main(String[] args){
//        binTodec(111);
//    }
//}


//                                      Decimal to binary Conversion

//public static void decTobin(int n){
//
//    int myNum=n;
//    int pow = 0;
//    int binNum = 0;
//
//    while(n > 0){
//        int rem = n % 2;
//        binNum = binNum +(rem *(int)Math.pow(10,pow));
//        pow++;
//        n=n/2;
//    }
//    System.out.println("binary form of " + myNum + "=" + binNum);
//}
//public static void main(String[] args){
//    decTobin(15);
//}
//}


//                                        Assignment

//Write a Java method to compute the average of three numbers


//public static double avg(double a,double b , double c ){
//      return (a+b+c)/3;
//}
//public static void main(String[] args){
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Eneter your first number");
//    double a = sc.nextDouble();
//
//    System.out.println("Eneter your second number");
//    double b = sc.nextDouble();
//
//    System.out.println("Eneter your third number");
//    double c = sc.nextDouble();
//    System.out.println(avg(a,b,c));
//}
//}


//     Write a method named is Even that accepts an int argument. The method should return true
//     if the argument is even,or false otherwise.Also write a program to test your method

//public static void main (String[] args){
//    Scanner sc = new Scanner (System.in);
//    int num;
//    System.out.println("enter an integer");
//        num = sc.nextInt();
//        if(isEven(num)){
//            System.out.println("even");
//        }
//        else
//        {
//            System.out.println("odd");
//        }
//}
//public static boolean isEven(int number){
//    if (number%2==0){
//        return true;
//
//    }
//    else{
//        return false;
//    }
//}
//}


    //Question3:Write a Java program to check if a number is a palindrome in Java?
//                  (121 is a palindrome, 321 is not)


}
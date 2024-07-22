//import java.util.*;
//public class A_advance_Pattern {
//                                // Hollow Ractangle
//    public static void main(String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter row = ");
//        int r = sc.nextInt();
//        System.out.print("Enter coloumn");
//        int c = sc.nextInt();
//        for (int i=1;i<=r;i++){
//            for (int j =1;j<=c;j++){
//                if (i==1||j==1||i==r||j==c){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

    //                             Inverted & rotated Half pyramid

//    public static void invertedHalfpyramid(int row) {
//        //outer loop
//        for (int i = 1; i <= row; i++) {
//            //space printing
//            for (int j = 1; j <= row - i; j++) {
//                System.out.print(" ");
//            }
//            //Stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
//
//public static void main(String[] args){
//    invertedHalfpyramid(4);
//}


    //                                  Inverted Half pyramid with Numbers
//
//    public static void invertd_numbers(int v){
//        for(int i =1;i<=v;i++){
//            for (int j=1; j<=v-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args){
//        invertd_numbers(5);
//}}



import java.util.*;

    public class A_advance_Pattern {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String n= scan.nextLine();
            int i = scan.nextInt();
            double v=scan.nextDouble();



            System.out.println("String: " + n);
            System.out.println("Double: " + v);
            System.out.println("Int: " + i);
        }
    }


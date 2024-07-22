
//Program to take user input and calculate the area of tringle with the help of 1/2*base*hight formula?

 import java.util.*;
public class variables {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Tringle Base:");
        double b =sc.nextDouble();
        System.out.println("Enter the value of Tringle Hight:");
        double l =sc.nextDouble();
        double Total_Area=0.5*b*l;
        System.out.println("Area of Tringle is : " +Total_Area);
    }

}

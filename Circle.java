//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6
    
  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 

//Define main method
  public static void main(String[] args){
    
//Scanner sc=new Scanner(System.in);
//Declare the variables

//radius=sc.newScanner();
// int radius,c;
  int radius,circle;
//Use the scanner class to provide radius at execution time
 
 //int radius=sc.nextInt();
// value=sc.nextInt();
//int radius=sc.nextInt();
 //value=sc.nextInt();
    
//Scanner scanner = new Scanner(System.in);
   Scanner sc=new Scanner (System.in);
//radius = scanner.nextInt();
    radius=sc.nextInt();
//Caluculate the circumference of the circle
   double circumference =2*3.14*radius;
//Casting the floating-point value to int  
//Float area =(int)c;
     circle=(int)circumference;
//Print the Result
System.out.println("The circumference of the circle is"+circle);
}
  }
 
//Good Job!
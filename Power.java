/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    
   Expected Output:
   result = 9
   
*/
import java.util.Scanner;
import java.lang.Math;
public class Power {

//main method
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("num1 =");
    double num1 = sc.nextInt();
    System.out.println("num2 = ");
    double num2 = sc.nextInt();
    Power p = new Power();
    double result = p.Power1(num2,num1);
    System.out.println("Result: "+result);
  }
  double Power1(double num1,double num2)
  {
    return(Math.pow(num2,num1));
  }
<<<<<<< HEAD
}
=======
}
//Good Job
>>>>>>> 165164c3d78b203c0a008b02b3d061c38f37f8e6

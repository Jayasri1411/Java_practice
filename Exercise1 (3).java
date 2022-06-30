/* Write a program to check whether a number is positive or negative
Test Data 1: x=31
Expected Output: Number is positive
Test Data 2: x=-31
Expected Output: Number is negative
*/
import java.util.Scanner;
class Exercise1 {

	public static void main(String args[]) {
      //Scanner sc=new Scanner(System.in);
      Scanner sc=new Scanner(System.in);
      int x;
      System.out.println("enter number");
      x=sc.nextInt();
    if(x>0){
      System.out.println("it is a positive number");
    }
    else{
       System.out.println("it is a negative number");
    }
  }
    }

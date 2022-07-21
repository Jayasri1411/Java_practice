/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException {

    public static void main(String args[]) {
      int num=10/0;
      byte num1=50/0;
      System.out.println(num);
      System.out.println(num1);
    }
}
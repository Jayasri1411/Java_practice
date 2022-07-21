/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter array elements");
      int arr[]=new int[5];
      for(int i=0;i<=5;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<=5;i++)//trying to enter 6th element it is showing array out of box index exception.
        {
          System.out.println(arr[i]);
        }
    }
}


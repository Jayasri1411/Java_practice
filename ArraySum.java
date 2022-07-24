/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum{

//Define the main method
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   System.out.println("choose how many numbers in array");
  int n=sc.nextInt();
//Declare the variables and initialize
int sum=0;
int arr[]=new int[n];
//Take input from user
 // Scanner sc=new Scanner(System.in);
  System.out.println("enter array elements ");
//Check user input values using for loop and add all value
   for(int i=0;i<arr.length;i++)
    {
   arr[i]=sc.nextInt();
//Print the result
    }
  for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
//Print the result
    }
  System.out.println(sum);
//   sum=sum+arr[i];
   }
      }
            

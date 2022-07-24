/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String[] args){
//Declare and initialize variables
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  float arr[]=new float[n];
  
//Take the 10 different expenses price
  
//Check the 10 different expenses price using for loop
for(int i=1;i<arr.length;i++){
  arr[i]=sc.nextFloat();
  //arr[j]=sc.nextFloat();
}
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
  for(int i=1;i<arr.length;i++)
  {
for(int j=1;j<arr.length;j++)
{
  //arr[j]=sc.nextFloat();
  if(a[i]>a[j])
  {
    a[j]=a[i];
  }
     }
}
//Print the result
System.out.println(a[i]);
}
     } 

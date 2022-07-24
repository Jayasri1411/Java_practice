/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {

//main method
public static void main(String[] args){
//declare variables
String str,str1;
//take input from user
Scanner sc=new Scanner(System.in);
//compare two strings if the search string found or not without using inbuilt method isSubString()
System.out.println("Enter string");
 // int result=str(CompareTo(Str1));
  str=sc.nextLine();
  str1=sc.nextLine();
   //str(CompareTo(Str1));
//creat isSubString method in that declare variable 
if(str.contains(str1)){
  System.out.println("bitlabs is found");
}
//check two strings if the search string is present then return true else return false
else{
  System.out.println("bitlabs is not found");
}
    sc.close();
    }
       }
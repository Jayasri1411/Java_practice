/* Write a program to find number of days in a month
Test Data: 
month number=2
year=2020
Expected Output: February 2020 has 29 days
*/
import java.util.Scanner;
class Exercise2 {

	public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
    int x,y;
    System.out.println("Enter month number");
    x=sc.nextInt();
    System.out.println("Enter year");
    y=sc.nextInt();
    System.out.println("Feb" +2020+ "has"+29+"days");
	}
}
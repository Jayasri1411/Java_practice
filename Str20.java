/*Write a JAVA program to find total number of alphabets, digits or special character in a string. */
import java.util.Scanner;
public class Str20
{
	
	public static void main(String[] args)
  {
		String str;
		int i, alph, digit, spl;
		i =0;
    alph =0;
    digit = 0;
    spl = 0;
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.print("Please String contains 
   alphabets,digits and special characters=  ");
		str = sc.nextLine();
		while(i < str.length())
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch 
        <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit++;
			}
			else {
				spl++;
			}
			i++;
		}		
		System.out.println("Number of Alphabets=  " + alph);
		System.out.println("Number of Digit=  " + digit);
		System.out.println("Number of Special Characters=  " + spl);
	}
}


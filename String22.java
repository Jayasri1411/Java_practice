import java.util.*;
class String22
  {
    public static void main(String args[])
    {
      String str;
      System.out.println("Enter string");
      Scanner sc=new Scanner(System.in);
      str=sc.nextLine();
      int count=0;
      //int i=0;
      int x=0;
      char ch='l';
      int y=str.length();
      for(int i=0;i<str.length();i++)//welcome
        {
          if(str.charAt(i)=='l')
         {
            count++;
           x=i;
           break;
          }
        }
      System.out.println(x);
      System.out.println(str.charAt(y-1));
    }
  }
//welcome to bitlabs
//p
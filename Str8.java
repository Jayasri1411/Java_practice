import java.util.*;
class Str8
  {
    public static void main(String args[])
    {
      String rev="";
      Scanner sc=new Scanner(System.in);
      System.out.println("enter String");
    String word=sc.nextLine(); 
   for(int i=word.length()-1;i>=0;i--)
     {
       rev=rev+word.charAt(i); 
     }     
    //System.out.println(StringFormatter.reverseWord(" "));  
      System.out.println(rev);
    }
  }
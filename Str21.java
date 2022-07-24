import java.util.*;
class Str21
  {
    public static void main(String[] args)
    {
      String str="Jayasrii";
      char ch='i';
      int count=0;
      int i=0;
      for(; i<str.length(); i++)
        {
          if(str.charAt(i)=='i')
          {
            count=2;
            break;
          }
        }
      if(count==0)
      {
        System.out.println("not found");
      }
      else{
         System.out.println(ch+" "+i);
      }
    }
  }
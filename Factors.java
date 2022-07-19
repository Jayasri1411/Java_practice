import java.util.*;
class Factors
  {
    public static void main(String args[])
    {
   // int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
   int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
      System.out.println("enter array elements");
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("The factors are");
      for(int i=0;i<n;i++)
        {
       for(int j=2;j<a[i];j++)
       if(a[i]%j==0)//9%3==0
       {
            b[i]=j;//j=3
            System.out.print(b[i]+","); 
      }
      System.out.println("");
      }
      }
  }
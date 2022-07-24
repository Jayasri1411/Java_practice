import java.util.Scanner;
class Product
  {
    int productid;
    String productname;
     void dispaly()
    {
      System.out.println(productid+""+productname);
    }
  }
class Main1
  {
    public static void main(String[] args)
    {
      Product p[]=new Product[]
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          p[i]=new Product();
          System.out.println("Enter productid");
           p[i].productid=sc.nextInt();
           System.out.println("Enter productname");
           p[i].productname=sc.next();
        }
    
    }
  }
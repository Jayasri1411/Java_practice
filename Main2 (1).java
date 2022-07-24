import java.util.Scanner;
class Product
  {
    int productid;
    String productname;
    Product(int productid,String productname)
    {
      this.productid=productid;
      this.productname=productname;
    }
     void dispaly()
    {
      System.out.println(productid+""+productname);
    }
  }
class Main2
  {
    public static void main(String[] args)
    {
      Product p[]=new Product[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          System.out.println("Enter productid");
           int productid=sc.nextInt();
           System.out.println("Enter productname");
           String productname=sc.next();
           p[i]=new Product(productid,productname);
        }
       for(int i=0;i<5;i++)
       {
         p[i].display();
       }
      
    }
  }
import java.util.*;
class Product
  {
    int pid;
    String pname;
    double price;
    String quantity;
    public String toString()
    {
      return "pid= "+pid+"\npname= "+pname+"\nprice= "+price+"\nquantity= "+quantity;
    }
  }
class Str5
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter String");
    String str=sc.nextLine(); 
    String words[]= str.split(" ");
      Product product=new Product();
      product.pid=Integer.parseInt(words[0]);
      product.pname=words[1];
      product.price=Double.parseDouble(words[2]);
      product.quantity=words[3];
      System.out.println(product);
      
     
    }
  }
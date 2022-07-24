//using constructor
import java.util.*;
class Product
  {
    int id;
    String name;
    Product(int id,String name){
   this.id=id;
   this.name=name;
    }
    void display()
    {
      System.out.println(id+" "+name);
    }
  }
    class Main6{
     public static void main(String []args){
      
       Product pr[]=new Product[5];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<5;i++){
         System.out.println("enter the product information");
     
         System.out.println("enter product id");
         int id=sc.nextInt();
         System.out.println("enter Product name");
         String name=sc.next();
          pr[i]=new Product(id,name);
       }
       for(int i=0;i<5;i++)
       {
        pr[i].display();
       } 
          }
            }
     //program using constructor
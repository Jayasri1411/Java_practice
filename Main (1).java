import java.util.*;
class Constructor
  {
    Scanner sc=new Scanner(System.in);
    String name;
    String address;
    int rollno;
    String batch;
    //constructor
    Constructor()
    {
      System.out.println("Enter name");
      name=sc.next();
      System.out.println("enter address");
      address=sc.next();
      System.out.println("Enter rollno");
      rollno=sc.nextInt();
    }
    void learn()
    {
      System.out.println(name+" Learning");
    }
    void write()
    {
      System.out.println(name+ " writing");
    }
    void read()
    {
      System.out.println(name+" reading");
    }
   public  String toString()
    {
      return "name : "+name+"  address: "+address;
    }
  }
class Main{
   public static void main(String args[])
    {
      //object create
   
        System.out.println("Read Student1 information");
      Student st1=new Student();
      System.out.println("Read Student 2 information");
      Student st2=new Student();
      System.out.println(st1);
      System.out.println(st2);
    }
}
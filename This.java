import java.util.Scanner;
class Student
  {
    Scanner sc=new Scanner(System.in);
    String name;
    String address;
    int rollno;
    String batch;
    //constructor
  Student(String name,String address)
    {
      this.name=name;
      this.address=address;
    }
    Student(String name,String address,int rollno,String batch )
    {
      this(name,address);
      this.rollno=rollno;
      this.batch=batch;
    }
    void learn()
    {
      System.out.println(name+" Learning");
    }
    void write()
    {
     this.learn();
      System.out.println(name+ " writing");
    }
    void read()
    {
      System.out.println(name+" reading");
    }
   public  String toString()
    {
      return "name : "+name+"  address: "+address+" rollno "+rollno+" batch"+batch;
    }
  }
class This{
   public static void main(String args[])
    {
      //object create
   
       
      Student st1=new Student("lalitha","vijayawada",123,"cse");
 
      Student st2=new Student("anitha","hyderabad",345,"IT");
      System.out.println(st1);
      System.out.println(st2);
      st1.write();
    }
}
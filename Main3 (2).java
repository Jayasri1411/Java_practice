//parameterized constructor
import java.util.*;
class Student
  {
    Scanner sc=new Scanner(System.in);
    String name;
    String address;
    int rollno;
    String batch;
    //constructor
    Student(String n,String a,int r,String b )
    {
      name=n;
      address=a;
      rollno=r;
      batch=b;
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
      return "name : "+name+"  address: "+address+" rollno "+rollno+" batch"+batch;
    }
  }
class Main3{
   public static void main(String args[])
    {
      //object create
   
       
      Student st1=new Student("lalitha","vijayawada",123,"cse");
 
      Student st2=new Student("anitha","hyderabad",345,"IT");
      System.out.println(st1);
      System.out.println(st2);
    }
}
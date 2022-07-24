import java.util.*;
class Student
  {
    int rollno;
    String name;
    void display()
    {
      System.out.println(rollno+" "+name);
    }
  }
class Main
  {
    public static void main(String args[])
    {
      Student st[]=new Student[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          System.out.println("enter Student information");
          st[i]=new Student();
          System.out.println("enter rollno");
          st[i].rollno=sc.nextInt();
          System.out.println("enter name");
          st[i].name=sc.next();
        }
      for(int i=0;i<5;i++)
        {
          System.out.println(st[i].rollno+" "+st[i].name);
        }
     
    }
  } 

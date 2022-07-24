  //Implementing single Inheritance using constructor
import java.util.*;
class Student
  {
    int rollno;
    String name;
    Student(int rollno,String name)
    {
      this.rollno=rollno;
      this.name=name;
    }
    void display()
    {
      System.out.println(rollno+" "+name);
    }
  }
class MathsStudent extends Student
  {
    String subject;
    MathsStudent(int rollno,String name,String subject)
    {
      super(rollno,name);
      this.subject=subject;
    }
    void subjectDetails()
    {
      System.out.println(rollno+" "+name+" "+subject);
    }
  }
class Main8
  {
    public static void main(String args[])
    {
      MathsStudent st[]=new MathsStudent[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          System.out.println("enter Student information");
          System.out.println("enter rollno");
         int  rollno=sc.nextInt();
          System.out.println("enter name");
       String name=sc.next();
        System.out.println("enter subject");
          String subject=sc.next();
     st[i]=new MathsStudent(rollno,name,subject);
        }
      for(int i=0;i<5;i++)
        {
         st[i].subjectDetails();
        }
     
    }
  }   
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
class MathsStudent extends Student
  {
    String subject;
    
    void subjectDetails()
    {
      System.out.println(rollno+" "+name+" "+subject);
    }
  }
class Main3
  {
    public static void main(String args[])
    {
      MathsStudent st[]=new MathsStudent[5];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<5;i++)
        {
          st[i]=new MathsStudent();
          System.out.println("enter Student information");
          System.out.println("enter rollno");
          st[i].rollno=sc.nextInt();
          System.out.println("enter name");
       st[i].name=sc.next();
        System.out.println("enter subject");
          st[i].subject=sc.next();
     
        }
      for(int i=0;i<5;i++)
        {
         st[i].subjectDetails();
        }
     
    }
  }
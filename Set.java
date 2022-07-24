//set
import java.util.*;
class Employee
  {
   private int eid;
   private String ename;
   private  String edept;
    //getters and setters methods
    //setter used to set the values to variable
    //getter method used to get the value of varaible
    void setEid(int id)
    {
      eid=id;
    }
    void setEname(String name)
    {
      ename=name;
    }
    String getEname()
    {
      return ename;
    }
    void setEdept(String dept)
    {
      edept=dept;
    }
    String getEdept()
    {
      return edept;
    }
    int getEid()
    {
      return eid;
    }
   
    
    public String toString()
    {
      return eid+" "+ename+" "+edept;
    }
    
  }
class Set
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee emp1=new Employee();
      System.out.println("Enter id");
     emp1.setEid(sc.nextInt());
      System.out.println("enter name");
     emp1.setEname(sc.next());
      System.out.println("Enter dept");
      emp1.setEdept(sc.next());
      System.out.println(emp1.getEid());
      System.out.println(emp1.getEname());
      System.out.println(emp1.getEdept());
     
     
    }
  }
import java.util.*;
class Employee
  {
    int eid;
    String ename;
    String edept;
    Employee()
    {
      eid=123;
      ename="lalitha";
      edept="accounts";
    }
    Employee(int id,String n,String ed)
    {
      eid=id;
      ename=n;
      edept=ed;
    }
   
    Employee(int id,String n)
    {
      eid=id;
      ename=n;
    }
    Employee(int id)
    {
      eid=id;
    }
    
    public String toString()
    {
      return eid+" "+ename+" "+edept;
    }
    
  }
class Main1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee emp1=new Employee();
      int id=sc.nextInt();
      String name=sc.next();
      String dept=sc.next();
      Employee emp2=new Employee(id,name,dept);
      Employee emp3=new Employee(12,"harika");
      System.out.println(emp1);
      System.out.println(emp2);
    }
  }
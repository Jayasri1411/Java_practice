/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
class NullPointerException
{
  //class Student
    {
      String name,city;
      double marks;
      void setname(String name)
      {
        this.name=name;
      }
      void setcity(String city)
      {
        this.city=city;
      }
      void setmarks(double marks)
      {
        this.marks=marks;
      }
      String getname()
      {
        return name;
      }
      String getcity()
      {
        return city;
      }
      Double getmarks()
      {
        return marks;
      }
      void businesslogic(String name,String city,double marks)
      {
        System.out.println("Name:"+name);
        System.out.println("City:"+city);
        System.out.println("Marks:"+marks);
      }
    }
    public static void main(String args[]) 
   {

    }
}
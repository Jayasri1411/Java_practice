//super class
class Vehicle
  {
    String color="black";
    void run()
    {
      System.out.println("vehicle running");
    }
  }
class Bike extends Vehicle
  {
    String color="blue";
    //overriding
    void color()
    {
      System.out.println(super.color);
    }
    void run()
    {
      super.run();
      System.out.println("Bike is running");
    }
  }
class Main4
  {
    public static void main(String args[])
    {
       Bike honda=new Bike();
    honda.run();
      System.out.println(honda.color);
      honda.color();
    }
   
  }
//polyoverride
class Vehicle
  {
    void run()
    {
      System.out.println("vehicle running");
    }
  }
class Bike extends Vehicle
  {
    //overriding
    void run()
    {
      System.out.println("Bike is running");
    }
  }
class Main2
  {
    public static void main(String args[])
    {
       Bike honda=new Bike();
    honda.run();
    }
   
  }
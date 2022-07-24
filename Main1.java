class BMW
  {
    void Mileage()
    {
      System.out.println("18 KM");
    }
   
  }
class AUDI extends BMW
  {
    //overriding
    void Mileage()
    {
      System.out.println("15 KM");
    }
  }
class Main1
  {
    public static void main(String args[])
    {
      AUDI audi=new AUDI();
      audi.Mileage();
      
      
    }
  }
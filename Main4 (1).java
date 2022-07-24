class Shape
  {
   static double area(float side)
    {
      return side*side;
    }
  static double area(double length,double breadth)
    {
      return length*breadth;
    }
    
  }
class Main4
  {
    public static void main(String args[])
    {
     
     double square= Shape.area(23);
      System.out.println(square);
      double rect=Shape.area(23,45);
      System.out.println(rect);
    }
  }
class Hill
  {
    public static void main(String[] args)
    {
      int n=25;
      for(int i=0;i<n;i++)
        {
          for(int j=i;j<n;j++)
            {
              System.out.print(" ");
            }
          for(int j=0;j<=i;j++)
            {
              System.out.print("#");
            }
          for(int j=0;j<i;j++)
            {
              System.out.print("*");
            }
          System.out.println();
        }
    }
    
  }
  
  
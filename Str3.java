class Str3
  {
    public static void main(String args[])
    {
     String str=new String("lalitha");
      
      for(int i=0;i<str.length();i++)
        {
          char ch=str.charAt(i);//i=0
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
            System.out.println(ch);
          }
        }
      //System.out.println(count);
     
    }
  }
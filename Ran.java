//package Jayasri;
import java.util.*;
class Ran{
  public static void main(String[] args){
    int a[] =new int[20];
    Random s=new Random();
    for(int i=1;i<a.length;i++){
      a[i] = s.nextInt(50);
    }
     // a[i]=i+10;
      for ( int i :  a)
      System.out.println(i);
    
  }
}
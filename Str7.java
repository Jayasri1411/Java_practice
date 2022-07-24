public class Str7 
{  
public static void main(String[] args)
 {  
    String words[]=str.split(" ");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
  }  
}
//do it
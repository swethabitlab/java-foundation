//program to check whether a character is upper case or lower case 
import java.util.*;
public class Alphabet2{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
    char c;
    System.out.println("enter a character");
    c=s.next().charAt(0);
    if((c>='A') && (c<='Z'))
      System.out.println(c+" is an upper case letter");
    else
     System.out.println(c+" is a lower case letter");
  }
}
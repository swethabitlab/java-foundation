//program to check whether a character is alphabet or not
import java.util.Scanner;
public class Alphabet{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    char ch;
    System.out.println("enter a character");
    ch=s.next().charAt(0);
    if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))
      System.out.println(ch+" is an alphabet");
    else
      System.out.println(ch+" is not an alphabet");
    System.out.println("end");
  }
}
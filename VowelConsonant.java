//program to check whether a character is vowel or consonant
import java.util.*;
public class VowelConsonant{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    char c;
    System.out.println("enter a character");
    c=s.next().charAt(0);
    if(((c>='a') && (c<='z')) || ((c>='A') && (c<='Z'))){
      if((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u'))
        System.out.println(c+" is a vowel");
      else
        System.out.println(c+" is a consonant");
      }
    else
        System.out.println(c+" is not an alphabet");
  }
}
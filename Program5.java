//program to find whether a number is positive or negative or zero
import java.util.Scanner;
public class Program5{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a;
    System.out.println("enter a number");
    a=s.nextInt();
    if(a>0)
       System.out.println("a is positive");
    else if(a<0)
       System.out.println("a is negative");
    else
       System.out.println("a is zero");
     System.out.println("end");
  }
}
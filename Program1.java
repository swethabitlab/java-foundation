//program to check whether the a number is even or odd
import java.util.Scanner;
public class Program1{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
    if(n%2==0)
      System.out.println("the number n is even "+n);
    else
      System.out.println("the number n is odd "+n);
    System.out.println("end");
  }
}
//program to check ehether a number is divisible by 5 and 11 or not
import java.util.Scanner;
public class Program4{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n;
    System.out.println("enter a number");
    n=s.nextInt();
   if((n%5==0)&&(n%11==0))
      System.out.println("n is divisible by 5 and 11");
    else
      System.out.println("n is not divisible by 5 and 11");
    System.out.println("end");
  }
}

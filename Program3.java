//program to find maximum of three numbers
import java.util.Scanner;
public class Program3{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter three numbers");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if((a>b)&&(a>c))
      System.out.println("a is bigger");
    else if(b>c)
      System.out.println("b is bigger");
     else
      System.out.println("c is bigger");
    System.out.println("end");
  }
}
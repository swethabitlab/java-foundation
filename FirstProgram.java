import java.util.Scanner;
public class FirstProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter the integer values");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("the addition of two integers is"+ (a + b));
    System.out.println("the subtraction of two integers is"+ (a - b));
  }
}
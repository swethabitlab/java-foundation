//program to find maximum of two numbers 
import java.util.Scanner;
public class Program2{
 public static void main(String[] args){
  Scanner s=new Scanner(System.in);
   int a,b;
   System.out.println("enter two numbers");
   a=s.nextInt();
   b=s.nextInt();
   if(a>b)
     System.out.println("a is greater");
   else
     System.out.println("b is greater");
   System.out.println("end");
 }
}
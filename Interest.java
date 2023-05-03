//program to calculate simple interest
import java.util.Scanner;
public class Interest{
  public static void main(String[] args){
    //creating object of Scanner class 
    Scanner s=new Scanner(System.in);
    float a,b,c;
    System.out.println("enter the float values");
    a=s.nextFloat();
    b=s.nextFloat();
    c=s.nextFloat();
     //calculating the simple interst
    System.out.println("simple interest is"+ (a*b*c)/100);
  }
}
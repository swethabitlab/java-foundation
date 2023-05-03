import java.util.Scanner;
public class Area{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int length,breadth;
    System.out.println("enter the values");
    length=sc.nextInt();
    breadth=sc.nextInt();
    System.out.println("the area of rectangle is"+ (length*breadth));
  }
}
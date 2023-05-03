
import java.util.Scanner;
public class Program{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String name;
    int age;
    float percentage;
    System.out.println("enter the name,age,percentage");
    name=s.next();
    age=s.nextInt();
    percentage=s.nextFloat();
    System.out.println("the name is " + name);
    System.out.println("the age is " + age);
    System.out.println("the percentage is " + percentage);
  }
}
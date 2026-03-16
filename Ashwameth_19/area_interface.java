import java.util.Scanner;

interface Shape{
  void area();
  void perimeter();
}

class Rectangle{
int length;
int breadth;
        Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        }
        
      public void area(){
      System.out.println("Area of Rectangle="+(length*breadth));
      }
      
      public void perimeter(){
      System.out.println("Perimeter of Rectangle"+(2*(length*breadth)));
      }
}



class Circle{
double radius;

 Circle(double radius){
 
 this.radius=radius;
 }
 
 public void area(){
   System.out.println("Area of circle="+(3.14*radius*radius));
 }
 
 public void perimeter(){
 System.out.println("Perimeter of Circle="+(2*3.14*radius));
 }
}


public class MainInterface{
public static void main(String arge[]){

Scanner sc=new Scanner(System.in);

System.out.println("Select choice from below");
while(true){
System.out.printl("1)Rectangle \n")
}

}
}



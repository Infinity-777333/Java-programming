import java.util.Scanner;

interface Shape{
  void area();
  void perimeter();
}

class Rectangle implements Shape {
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
      System.out.println("Perimeter of Rectangle="+(2*(length+breadth)));
      }
}



class Circle implements Shape{
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
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Select choice from below");

int n=0;
while(n!=3){
System.out.print("1)Rectangle \n2)Circle \n3)Exit \nEnter your choice:");
 n=sc.nextInt();
switch(n){
 
 case 1:
    System.out.print("Enter Length of Rectangle:");
    int l=sc.nextInt();
    System.out.print("Enter Breadth of Rectangle:");
    int b=sc.nextInt();
    
    Shape s1=new Rectangle(l,b);
    s1.area();
    s1.perimeter();
   
    break;
    
 case 2:
    System.out.print("Enter the radius of Circle:");
    double r=sc.nextDouble();
    Shape s2=new Circle(r);
    s2.area();
    s2.perimeter();
    break;
  case 3:
    System.out.println("Exiting......");
    break;
  
  default:
    System.out.println("Enter a valid choice");

}
}

}

}



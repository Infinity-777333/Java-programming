import java.util.Scanner;
 
 class Shapes{
 void show(){
  
  System.out.println("Calculating Areas.....");
   
 }
 }
 
 class Rectangle extends Shapes{
  int length,breadth;
  
  
   Rectangle(int length,int breadth){
   this.length=length;
   this.breadth=breadth;
   }
   
   
  void show(){
  int area=length*breadth;
   System.out.println("Area of rectangle:"+area);
  }
 }
 
 
 class Circle extends Shapes{
 double radius;
 
  
        
      Circle(double radius){
      this.radius=radius;
      }
      
  
      
void show(){
 double area=3.14*radius*radius;
   System.out.println("Area of Circle:"+area);
  }
 }
 
 class Square extends Shapes{
 int side;
    
    Square(int side){
    this.side=side;
    }

 
 void show(){
 int area=side*side;
 System.out.println("Area of Square:"+area);
 }
 }
 
 public class AreaOverriding{
   
   public static void main(String ar[]){
   Scanner sc=new Scanner(System.in);
   
   System.out.println("\nEnter the details of Rectangle\n");
   System.out.print("Length:");
   int l=sc.nextInt();
   
   System.out.print("Breadth:");
   int b=sc.nextInt();
   
   System.out.print("Enter the radius of circle:");
   double r=sc.nextDouble();
   
   System.out.print("Enter the side of square:");
   int sd=sc.nextInt();
   
   Shapes s;
    s=new Rectangle(l,b);
   s.show();
   s=new Circle(r);
   s.show();
    s=new Square(sd);
   s.show();
   }
 }
 
 

import java.util.Scanner;

class Area{
  double pi=3.14;
 void area(int side){
       System.out.println("Area of Square:"+(side*side));
               }

 void area(double length,double breadth){
        System.out.println("Area of rectangle:"+(length*breadth));                           
                                   }
          
 void area(double radius){
         System.out.println("Area of Circle:"+(pi*radius*radius));          
                   }
          }
         
         
  public class AreaOverloading{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Area ar=new Area();
        
        System.out.print("Enter the side of Square:");
        int side=sc.nextInt();
        
         System.out.print("Enter the Length of rectangle:");
        double length=sc.nextDouble();
        System.out.print("Enter the Breadth of rectangle:");
        double breadth=sc.nextDouble();
        
        System.out.print("Enter the Radius of circle:");
        double radius=sc.nextDouble();
        
        
      System.out.println("\nArea of Shapes are given below\n");
          ar.area(side);
          ar.area(length,breadth);
          ar.area(radius);
        
        }                      
                              }       
         
         
    

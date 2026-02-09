import java.util.Scanner;
class Product{
         int pcode;
         String pname;
         double price;
      Product(int c,String n,double p){
          pcode=c;
          pname=n;
          price=p;
          }
       public static void main(String ar[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of product 1");
         System.out.print("Product Code:");
         int c1=sc.nextInt();
         System.out.print("Product Name:");
         String n1=sc.next();
         System.out.print("Product Price:");
         double p1=sc.nextDouble();
         
         
         System.out.println("Enter the details of product 2");
          System.out.print("Product Code:");
         int c2=sc.nextInt();
          System.out.print("Product Name:");
         String n2=sc.next();
          System.out.print("Product Price:");
         double p2=sc.nextDouble();
         
         System.out.println("Enter the details of product 3");
         System.out.print("Product Code:");
         int c3=sc.nextInt();
         System.out.print("Product Name:");
         String n3=sc.next();
          System.out.print("Product Price:");
         double p3=sc.nextDouble();
               
         Product pr1=new Product(c1,n1,p1);
         Product pr2=new Product(c2,n2,p2);
         Product pr3=new Product(c3,n3,p3);    
         
         Product low=pr1;
         
         if(pr2.price<low.price)
         {
         low=pr2;
         }
         if(pr3.price<low.price)
         {
         low=pr3;
         }
         System.out.println("\n\nProduct with lowest price");
         System.out.println("Product code:"+low.pcode);
          System.out.println("Product name:"+low.pname);
           System.out.println("Product price:"+low.price);   
         }
         }

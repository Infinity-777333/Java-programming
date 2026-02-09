import java.util.Scanner;

class Complex{
     int real;
     int imag;
     Complex(int r,int i){
      real=r;
      imag=i;
      }
      
   public static void main(String ar[]){
     
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first complex number");
       System.out.print("real part:");
       int r1=sc.nextInt();
        System.out.print("imaginary part:");
        int i1=sc.nextInt();
        
         System.out.println("\nEnter the second complex number");
       System.out.print("real part:");
       int r2=sc.nextInt();
        System.out.print("imaginary part:");
        int i2=sc.nextInt();
        
        Complex c1=new Complex(r1,i1);
        Complex c2=new Complex(r2,i2);
        
        int reals=c1.real+c2.real;
        int imags=c1.imag+c2.imag;
        
      System.out.println("Sum of the complex number ="+reals+"+i "+imags);
      }
      }

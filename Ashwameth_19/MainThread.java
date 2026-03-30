import java.util.Scanner;
class MultiplicationThread extends Thread{

  public void run(){
  System.out.println("Multiplication table of 5");
  for(int i=1;i<=5;i++){
  System.out.println(i+" * 5 = "+(i*5));
  
  }
  }
}

class PrimeThread extends Thread{
    int n;
    PrimeThread(int n){
    this.n=n;
    }
  public void run(){
    int count=0,num=2;
 
  
   System.out.println("First "+n+" Prime numbers");
   
   while(count<n){
      boolean isprime=true;
   for(int i=2;(i*i)<=num;i++){
   if(num%i==0){
     isprime=false;
     break;
   }
   }
   if(isprime){
   System.out.print(num+" ");
   
   count++;
   }
   num++;
   
   }
   System.out.println();
  
    
}
}

public class MainThread{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Enter the value of n:");
int n=sc.nextInt();

 
 PrimeThread pt=new PrimeThread(n);
 MultiplicationThread mt=new MultiplicationThread();
 
 mt.start();
 pt.start();

}
}

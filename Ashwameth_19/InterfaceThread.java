import java.util.Scanner;

class Fibonacci implements Runnable{
 
 int fn;
 Fibonacci(int fn){
 this.fn=fn;
 }
 
 public void run(){
 int a=0,b=1,c;
 System.out.println("First "+fn+"Fibonacci number");
 for(int i=1;i<=fn;i++){
 System.out.println(a);
 c=a+b;
 a=b;
 b=c;
 }
 
 }
}


class EvenNumber implements Runnable{
int en;
EvenNumber(int en){
this.en=en;
}

public void run(){
System.out.println("Even numbers upto "+en);
for(int i=0;i<=en;i++){
if(i%2==0){
System.out.println(i);
}
}
}

}


public class InterfaceThread{
public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter the limit of Fibonacci number:");
       int fn=sc.nextInt();
       System.out.print("Enter the range of Even numbers:");
       int en=sc.nextInt();
     
      Fibonacci fb=new Fibonacci(fn);
      Thread t1=new Thread(fb);
      
      EvenNumber ev=new EvenNumber(en);
      Thread t2=new Thread(ev);      
       
       t1.start();
       t2.start();
}

}

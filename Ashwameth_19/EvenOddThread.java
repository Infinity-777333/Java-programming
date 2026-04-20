import java.util.*;
class EvenThread extends Thread{
int n;
EvenThread(int n){
this.n=n;
}
public void run(){
System.out.print("Even numbers in range: ");
for(int i=0;i<n;i++){
if(i%2==0){
System.out.println("Even"+i);
}
}
}

}




class OddThread extends Thread{
int n;
OddThread(int n){
this.n=n;
}
public void run(){
System.out.print("\nOdd numbers in range: ");
for(int j=0;j<n;j++){
if(j%2!=0){
System.out.println("Odd"+j);
}
}
}

}



public class EvenOddThread{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Enter the limit of number:");
int n=sc.nextInt();

EvenThread et=new EvenThread(n);
OddThread ot=new OddThread(n);

et.start();
ot.start();



}
}

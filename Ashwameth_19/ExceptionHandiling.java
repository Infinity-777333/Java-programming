import java.util.Scanner;

public class ExceptionHandiling{

public static void main(String ar[]){
  Scanner sc=new Scanner(System.in);
  
  try{
  
   System.out.print("Enter a number:");
   int a=sc.nextInt();
   System.out.print("Enter divisor:");
   int b=sc.nextInt();
   System.out.println("a/b="+(a/b));
   
   }
   catch(ArithmeticException e){
   System.out.println(e.getMessage());
   }
   
  try{
  
  System.out.print("Enter the size of array:");
  int s=sc.nextInt();
  int [] arr=new int[s];
  System.out.println("Enter elements");
  for(int i=0;i<s;i++){
  arr[i]=sc.nextInt();
  
  }
  
  System.out.print("Enter the array position which the element have to print:");
  int p=sc.nextInt();
  System.out.println("Element at"+p+"th position:"+arr[p]);
  }
  
  catch(ArrayIndexOutOfBoundsException b){
  System.out.print(b.getMessage());
  }
  
}

}

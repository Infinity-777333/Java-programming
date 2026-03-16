import java.util.Scanner;

class NegativeException extends Exception{

NegativeException(String msg){
super(msg);
}

 public static void main(String args []){
 
 Scanner sc=new Scanner(System.in);


   System.out.print("Enter the number of Integers:");
   int n=sc.nextInt();
   
   int sum=0;
   
   System.out.println("Enter the numbers");
   for(int i=1;i<=n;i++){
   System.out.print("Number "+i+":");
   try{
   int num=sc.nextInt();
   
   if(num<0){
    i--;
   throw new NegativeException("Cannot add Negative number!!");
  
   }
   sum=sum+num;
   }
   catch(NegativeException ne){
    System.out.println(ne.getMessage());
  } 
   

   }
   
 System.out.println("Sum="+sum);
 double avg=(double)sum/n;
 System.out.println("Average="+avg);
   
  
}
}

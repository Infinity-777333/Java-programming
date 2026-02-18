import java.util.Scanner;
public class ElementSearch{
  public static void main(String ar[]){
  Scanner sc =new Scanner(System.in);
  
  System.out.print("Enter the number of elements:");
  int n=sc.nextInt();
  int [] e=new int[n];
   System.out.println("Enter the  elements");
    for(int i=0;i<n;i++){
    e[i]=sc.nextInt();
    }
    
  System.out.print("Enter the element want to search:");
  int key=sc.nextInt();
  int pos=1,found=0;
  
  for(int i=0;i<n;i++){
    if(e[i]==key){
    System.out.println("Element "+key+" is found at position "+pos);
    found=1;
    break;
    }
    pos++;
    }
    
  if(found!=1){
  System.out.println("Element "+key+" is not found!!");
  }
    
  
  }
}

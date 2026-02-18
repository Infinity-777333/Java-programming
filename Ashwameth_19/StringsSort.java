import java.util.Scanner;
import java.util.Arrays;

public class StringsSort{
 public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of Strings:");
    int n=sc.nextInt();
    
    String [] s=new String [n];
    System.out.print("Enter the Strings:");
    
    for(int i=0;i<n;i++){
    s[i]=sc.next();    
    }
    
    Arrays.sort(s);
    System.out.print("Sorted Strings:");
    
    for(String x: s){
    System.out.print(x+" ");
    }
      System.out.println();
 }  
}

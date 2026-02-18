import java.util.Scanner;

public class CharSort{
 public static void main(String ar[]){
  Scanner sc=new Scanner(System.in);
  
  System.out.print("Enter the String:");
  String str=sc.nextLine();
  
  char [] ch=str.toCharArray();
  for(int i=0;i<ch.length-1;i++){
  for(int j=0;j<ch.length-i-1;j++){
 if(ch[j]>ch[j+1]){
  char temp=ch[j];
  ch[j]=ch[j+1];
  ch[j+1]=temp;
  }
  }
  }
  
  System.out.print("Sorted characters:");
  
  for(char x: ch){
  System.out.print(x);
  }
  System.out.println();
 } 
}

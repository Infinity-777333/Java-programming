import java.util.Scanner;
class StudentMark{
    
    public static void main(String ar[]){
    int total=0;
    float percentage;
     Scanner sc=new Scanner(System.in);
      
      
      System.out.print("Enter the number of subjects:");
      int n=sc.nextInt();
      int [] mark=new int [n];
      
      System.out.println("Enter the marks");
      for(int i=0;i<n;i++){
        mark[i]=sc.nextInt();     
        total=total+mark[i];
        }
        
        System.out.print("Enter the Maximum marks for a subject:");
        int max=sc.nextInt();
        
        percentage=((float)total/(max*n))*100;
        
        
        System.out.println("Total mark="+total);
        System.out.println("Mark percentage="+percentage+"%");
          }
          }

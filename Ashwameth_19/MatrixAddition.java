import java.util.Scanner;
class MatrixAddition{
  public static void main(String ar[]){
         
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the no of rows:");
         int x=sc.nextInt();
          System.out.print("Enter the no of columns:");
          int y=sc.nextInt();
         int [][] a=new int [x][y];
         int [][] b=new int [x][y];
         int [][] sum=new int [x][y];
         System.out.println("Enter the first matrix");
         
         for(int i=0;i<x;i++){
         for(int j=0;j<y;j++){
           a[i][j]=sc.nextInt();
           }
           }
           
        System.out.println("Enter the second matrix");
          
          
         for(int i=0;i<x;i++){
         for(int j=0;j<y;j++){
           b[i][j]=sc.nextInt();
           }
           }
           
         System.out.println("Sum of the two matrices");
          for(int i=0;i<x;i++){
         for(int j=0;j<y;j++){
           sum[i][j]=a[i][j]+b[i][j];
            System.out.print(sum[i][j]+" ");
           }
             System.out.println();
           }
           }
           }

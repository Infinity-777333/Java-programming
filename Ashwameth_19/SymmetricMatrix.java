import java.util.Scanner;
class SymmetricMatrix{
public static void main(String ar[]){
  Scanner sc =new Scanner(System.in);
  
  System.out.print("Enter the number of Rows:");
  int r=sc.nextInt();
  
  System.out.print("Enter the number of Columns:");
  int c=sc.nextInt();
  
  if(r!=c)
  {
  System.out.println("No of Rows and columns must be same!!!!!");
return;
}
int [][] a=new int[r][c];
 System.out.println("Enter the MATRIX:");
 for(int i=0;i<r;i++){
 for(int j=0;j<c;j++){
  a[i][j]=sc.nextInt();
  }
  }
  
   for(int i=0;i<r;i++){
 for(int j=0;j<c;j++){
  if(a[i][j]!=a[j][i]){
 System.out.println("The entered matrix is not a symmetric matrix!!"); 
 return;
}
  }
  }
 
 System.out.println("The entered matrix is a symmetric matric");
  
}
}

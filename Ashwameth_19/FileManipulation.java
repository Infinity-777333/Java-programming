import java.io.*;
import java.util.Scanner;

public class FileManipulation{
public static void main(String args[]){
   Scanner sc =new Scanner(System.in);
try{
  System.out.print("Enter  file name:");
  String filename=sc.nextLine();
  FileWriter fw=new FileWriter(filename);
  
   System.out.println("Enter the contents in file(type 'end' to exit):");
   while(true){
   String line=sc.nextLine();
    if(line.equals("end")){
    break;
    }   
   fw.write(line + "\n");
   
   }
   fw.close();
  System.out.println("Data entered successfully\n");
  
  FileReader fr=new FileReader(filename);
  BufferedReader br=new BufferedReader(fr);
  String readLine;
  System.out.println("Contents inside file");
  while((readLine=br.readLine())!=null){
  System.out.println(readLine);
  
  }
  fr.close();
  br.close();
  
}
catch(IOException ex){
System.out.println(ex.getMessage());
}
}
}

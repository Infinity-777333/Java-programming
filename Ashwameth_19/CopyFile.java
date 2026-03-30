import java.io.*;
import java.util.Scanner;

public class CopyFile{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
System.out.print("Enter the file name which have to copy:");
String source=sc.nextLine();
System.out.print("Enter the file where we have to paste:");
String dest=sc.nextLine();

FileReader fr=new FileReader(source);
BufferedReader br=new BufferedReader(fr);

String readLine;
FileWriter fw=new FileWriter(dest);
while((readLine=br.readLine())!=null){
fw.write(readLine + " \n");

}
fr.close();
br.close();
fw.close();
System.out.println("File copied successfully");

}

catch(IOException ex){
System.out.println(ex.getMessage());
}

}
}

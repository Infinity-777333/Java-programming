import java.util.*;
public class Count{
public static void main(String args[]){
int v=0,a=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String:");
String str=sc.nextLine();
str=str.toLowerCase();

char ch[]=str.toCharArray();

for(int i=0;i<str.length();i++){
if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
 v++;
}
else if(ch[i]==' '){}
else{
a++;
}
}

System.out.println("Number of vowels:"+v);
System.out.println("Number of constents:"+a);
}
}

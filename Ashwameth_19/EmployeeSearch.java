import java.util.Scanner;
class Employee{
int empno,salary;
String empname;

 Employee(int no,String name,int sal){
 empno=no;
 empname=name;
 salary=sal;
 }
 
 void display(){
 System.out.println("Employee number:"+empno+"\nEmployee name:"+empname+"\nSalary:"+salary);
 }
}


public class EmployeeSearch{
public static void main(String ar[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of employees:");
int n=sc.nextInt();
sc.nextLine();

Employee[] emp=new Employee[n+1];

for(int i=1;i<=n;i++){
 System.out.println("Enter Details of employee "+i);
 System.out.print("Emp_no:");
 int no=sc.nextInt();
 
 System.out.print("Emp_name:");
 String name=sc.next();
 sc.nextLine();
 System.out.print("Salary:");
 int sal=sc.nextInt();
 
 emp[i]=new Employee(no,name,sal);
}  


System.out.print("Enter the Emp_no to search:");
int key=sc.nextInt();
int found=0;
for(int i=1;i<=n;i++){
if(emp[i].empno==key){
  System.out.println("Employee is found,the details is given below");
  emp[i].display();
  found=1;
  break;
}
}

if(found==0){
System.out.println("Employee is not found");
}
  
}
}

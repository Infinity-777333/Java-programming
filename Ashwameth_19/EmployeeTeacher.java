import java.util.Scanner;
import java.util.Arrays;
class Employee{

int empno;
String name;
double salary;

Employee(int empno,String name,double salary){
  this.empno=empno;
  this.name=name;
  this.salary=salary;
}
void display(){
  System.out.println("\nEmployee ID:"+empno+"\nName:"+name+"\nSalary:"+salary);
}

}


class Teacher extends Employee{
  String dept,sub;
Teacher(int empno,String name,double salary,String dept,String sub){
   super(empno,name,salary);
   this.dept=dept;
   this.sub=sub;
  
}

void display(){
super.display();
  System.out.println("Department:"+dept+"\nSubject:"+sub+"\n");
}

}

public class EmployeeTeacher{
    public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the number of Teachers:");
    int n=sc.nextInt();
    Teacher[] tr=new Teacher[n];
    
    for(int i=0;i<n;i++){
    System.out.println("Enter the details of Teacher"+(i+1));
    
    System.out.print("Employee ID:");
    int id=sc.nextInt();
    
   sc.nextLine();
    System.out.print("Name:");
    String name=sc.nextLine();
    
       System.out.print("Salary:");
    double salary=sc.nextDouble();
    sc.nextLine();
    
    System.out.print("Department:");
    String dept=sc.nextLine();
    
    System.out.print("Subject:");
    String sub=sc.nextLine();
    
    tr[i]=new Teacher(id,name,salary,dept,sub);
    
    }
    System.out.println("\nDetails of teachers");
    for(int i=0;i<n;i++){
    tr[i].display();
    }
    
    
    }
}

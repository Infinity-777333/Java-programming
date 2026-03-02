import java.util.Scanner;
import java.util.Arrays;

class Person{
      String name,gender,address;
      int age;
      Person(String name,String gender,String address,int age){
      this.name=name;
      this.gender=gender;
      this.address=address;
      this.age=age;
      }
      
      void display(){
      System.out.println("\nName:"+name+"\nGender:"+gender+"\nAddress:"+address+"\nAge:"+age);
      }
      
      
}

class Employee extends Person{
   String cname,qualification;
   int empid,salary;
                
       Employee(String name,String gender,String address,int age,int empid,String cname,String qualification,int salary){
       super(name,gender,address,age);
       this.empid=empid;
       this.cname=cname;
       this.qualification=qualification;
       this.salary=salary;
       
       }
       
     void display(){
     super.display();
     System.out.println("Employee Id:"+empid+"\nCompany Name:"+cname+"\nQualification:"+qualification+"\nSalary:"+salary);
     }
}

public class Teacher extends Employee{
String subject,dept,tid;

        Teacher(String name,String gender,String address,int age,int empid,String cname,String qualification,int salary,String subject,String dept,String tid){
        super(name,gender,address,age,empid,cname,qualification,salary);
        this.subject=subject;
        this.dept=dept;
        this.tid=tid;
        }
       void display(){
       super.display();
       System.out.println("Subject:"+subject+"\nDepartment:"+dept+"\nTeacher Id:"+tid);
       }
       public static void main(String ar[]){
       Scanner sc=new Scanner(System.in);
       
       System.out.print("Enter the number of Teachers:");
        int n=sc.nextInt();
         sc.nextLine();
         
         Teacher [] tr=new Teacher[n];
         
         System.out.println("Enter the Details of Teachers\n");
         
         for(int i=0;i<n;i++){
         System.out.println("\nTeacher "+(i+1));
         
         System.out.print("Name:");
         String name=sc.nextLine();
         
         System.out.print("Gender:");
         String gender=sc.nextLine();
         
         System.out.print("Address:");
         String address=sc.nextLine();
         
         System.out.print("Age:");
         int age=sc.nextInt();
         
         System.out.print("Employee Id:");
         int empid=sc.nextInt();
         sc.nextLine();
          
        System.out.print("Company Name:");
        String cname=sc.nextLine();
        
        System.out.print("Qualification:");
        String qualification=sc.nextLine();
        
          System.out.print("Salary:");
          int salary=sc.nextInt();
          sc.nextLine();
          
            System.out.print("Subject:");
            String subject=sc.nextLine();
            
            System.out.print("Department:");
            String dept=sc.nextLine();
              
            System.out.print("Teacher Id:");
            String tid=sc.nextLine();
            
        tr[i]=new Teacher(name,gender,address,age,empid,cname,qualification,salary,subject,dept,tid);
                  
         }
         
         System.out.println("\nDetails of Teacher");
          
          for(int i=0;i<n;i++){
          System.out.println("\nTeacher "+(i+1)+"\n--------------");
          tr[i].display();
          }
       }
}

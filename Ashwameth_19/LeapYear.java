import java.util.Scanner;
class LeapYear{
      public static void main(String ar[]){
           Scanner sc=new Scanner(System.in);
            System.out.print("Enter the year:");
           int year=sc.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0)
              {
               System.out.println("The year "+year+" is a leap year");
               }
               else
               {
                  System.out.println("The year "+year+" is a not a leap year");
               }
               }
               }

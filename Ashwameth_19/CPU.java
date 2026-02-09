import java.util.Scanner;
class CPU{
   int price;
        CPU(int p)
        {
        price=p;
        }
        
   public class Processor{
        int core;
        String manu1;
        Processor(int c1,String m1)
        {
         core=c1;
         manu1=m1;
         }
         
      void prodisplay(){
         System.out.println("Processor cores:"+core);
         System.out.println("Processor Manufacture:"+manu1);
         }     
         }
         
    static class RAM{
            int memory;
            String manu2;
            RAM(int me,String m2){
            memory=me;
            manu2=m2;
            }
        
          void ramdisplay(){
         System.out.println("RAM Memory:"+memory);
         System.out.println("RAM Manufacture:"+manu2);
         }     
            }
            
    public static void main(String ar[]){
          Scanner sc= new Scanner(System.in);
        
         System.out.print("Enter the Price of CPU:");
         int p=sc.nextInt();
         
         System.out.print("Enter the no of cores in processor:");
         int cr=sc.nextInt();
         System.out.print("Enter the Processor Manufacturer:");
         String m1=sc.next();
         
         System.out.print("Enter the RAM memory:");
         int mem=sc.nextInt();
         System.out.print("Enter the RAM Manufacturer:");
         String m2=sc.next();
         
         CPU cp=new CPU(p);
         CPU.Processor pr=cp.new Processor(cr,m1);
         CPU.RAM r=new CPU.RAM(mem,m2);
         
         System.out.println("\n\n*****CPU Details*****");
         
         System.out.println("Price:"+cp.price);
         pr.prodisplay();
         r.ramdisplay();
         
         }
         }

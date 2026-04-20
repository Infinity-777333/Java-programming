import java.awt.*;
import java.awt.event.*;
 public class GreatestThree extends Frame implements ActionListener{
 
 Label l1,l2,l3,l4,result;
 TextField t1,t2,t3;
 Button bt;
 
 GreatestThree(){
 l1=new Label("Enter the first number:");
 l2=new Label("Enter the Second number:");
 l3=new Label("Enter the third number:");
 l4=new Label("Greatest number is:");
 result=new Label();
 
 t1=new TextField();
 t2=new TextField();
 t3=new TextField();
 
 bt=new Button("Find Greatest");
 add(l1); add(t1);
 add(l2); add(t2);
 add(l3); add(t3);
 add(l4); add(result);
 add(bt);
 bt.addActionListener(this);
 setLayout(new GridLayout(6,2));
 setVisible(true);
 setSize(350,250);
 
 addWindowListener(new WindowAdapter(){
 public  void windowClosing(WindowEvent we){
 dispose();
 }
 
 });
 
 }
 
 public void actionPerformed(ActionEvent e){
 try{
   int a=Integer.parseInt(t1.getText());
   int b=Integer.parseInt(t2.getText());
   int c=Integer.parseInt(t3.getText());
    
    int large=a;
    if(large<b){
    large=b;
    }
    if(large<c){
    large=c;
    }
    
    result.setText(String.valueOf(large)); 
 }
 catch(Exception ex){
 System.out.println(ex.getMessage()+"\n Enter a valid input");
 }
 
 
 }
 
 
 
 
 public static void main(String args[]){
 
 new GreatestThree();
 }
 
 }

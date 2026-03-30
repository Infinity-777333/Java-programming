import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener{
  Label l1,l2,l3,result;
  TextField t1,t2;
  Button add,sub,mult,div;
  
  SimpleCalculator(){
  l1=new Label("Enter first number :");
  l2=new Label("Enter second number :");
  l3=new Label();
  t1=new TextField();
  t2=new TextField();
  
  
  add=new Button("Add");
  sub=new Button("Subtract");
  mult=new Button("Multiplication");
  div=new Button("Division");
  
  setLayout(new GridLayout(6,2));
  
  result=new Label("Result:");
  add(l1); add(t1);
  add(l2); add(t2);
  add(result);
  add(l3);
  add(add);
  add(sub);
  add(mult);
  add(div);
  
  add.addActionListener(this);
  sub.addActionListener(this);
  mult.addActionListener(this);
  div.addActionListener(this);
  
  setSize(350,250);
  setVisible(true);
  
  
 addWindowListener(new WindowAdapter(){
 public  void windowClosing(WindowEvent we){
 dispose();
 }
 
 });

}


public void actionPerformed(ActionEvent e){

try{
  Double a=Double.parseDouble(t1.getText());
  Double b=Double.parseDouble(t2.getText());
  
  if(e.getSource()==add){
  Double c=a+b;
  l3.setText(String.valueOf(c));
  }
  
  else if(e.getSource()==sub){
  Double c=a-b;
 l3.setText(String.valueOf(c));
  }
  
  else if(e.getSource()==mult){
  Double c=a*b;
  l3.setText(String.valueOf(c));
  }
  
  else{
  if(b!=0){
  Double c=a/b;
  l3.setText(String.valueOf(c));
  }
  else{
  l3.setText("cant divide by zero");
  }
  }}
 catch(Exception ex){
 l3.setText("Invalid Input");
 }


}
public static void main(String args[]){
new SimpleCalculator();
} 
}

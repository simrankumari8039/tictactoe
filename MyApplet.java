import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class MyApplet extends Applet{
       Label l1,l2,l3;
      TextField t1,t2;
     Button b;
      public void init(){
       l1=new Label("firstname");
       l2=new Label("secondname");
       l3=new Label(); 
       t1=new TextField();
       t2=new TextField();
       b=new Button("Add");
      setLayout(null);
       l1.setBounds(30,50,100,20);
       l2.setBounds(30,100,100,20);
       t1.setBounds(150,50,100,20);
       t2.setBounds(150,100,100,20);
       b.setBounds(100,150,80,20);
       l3.setBounds(30,180,100,20);
       add(l3);
      add(l1);
       add(l2);
       add(t1);
        add(t2);
       add(b);
     b.addActionListener(new MyHandler());
     
}
 public class MyHandler implements ActionListener
  {  public void actionPerformed(ActionEvent e)
        {   int x,y,z;
            x=Integer.parseInt(t1.getText());
            y=Integer.parseInt(t2.getText());
            z=x+y;
     l3.setText("sum is"+z);
 }
}           
}
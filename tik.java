import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*; 

public class tik extends Applet{
       Label l1,l2,l3;
      char a='O';
     int c=0,f=0;
    Button  b,b1,b2,b3,b4,b5,b6,b7,b8,b9;
      public void init(){
       l1=new Label("PLAYER1");
       l2=new Label("PLAYER2");
       l3=new Label("Tic_Tok_Toe");
       b=new Button("NEW GAME");
        b1=new Button("");
         b2=new Button("");
         b3=new Button("");
         b4=new Button("");
          b5=new Button("");
  b6=new Button("");
  b7=new Button("");
  b8=new Button("");
  b9=new Button("");
      setLayout(null);

        
       l3.setBounds(100,5,100,20);       
       l1.setBounds(5,20,100,20);
       l2.setBounds(200,20,100,20);
        b.setBounds(80,250,100,20);
b1.setBounds(50,50,50,50);
b2.setBounds(100,50,50,50);
b3.setBounds(150,50,50,50);
b4.setBounds(50,100,50,50);
b5.setBounds(100,100,50,50);
b6.setBounds(150,100,50,50);
b7.setBounds(50,150,50,50);
b8.setBounds(100,150,50,50);
b9.setBounds(150,150,50,50);
     
       
add(l1);
 add(l2);
 add(l3);
 add(b1);
 add(b);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
   b.addActionListener(new MyHandler());
 b1.addActionListener(new M1());
 b2.addActionListener(new M1());
 b3.addActionListener(new M1());
 b4.addActionListener(new M1());
 b5.addActionListener(new M1());
 b6.addActionListener(new M1());
 b7.addActionListener(new M1());
 b8.addActionListener(new M1());
 b9.addActionListener(new M1());
     
      }
 public class MyHandler implements ActionListener
  {  public void actionPerformed(ActionEvent e)
      {   a='O';
          f=0;
          c=0;
           l1.setText("PLAYER1");
           l2.setText("PLAYER2");
          b1.setLabel("");
          b2.setLabel("");
         b3.setLabel("");
b9.setLabel("");
b4.setLabel("");
b5.setLabel("");
 b6.setLabel("");
b7.setLabel("");
b8.setLabel("");
        }
  }
 
   
  public class M1 implements ActionListener
  {  


 public void win()
{                   if(a=='X')
                         { l1.setText("WINNER");
                               
                           }
                        else
                         { l2.setText("WINNER");
                          }
                       f=1;
}



 public void actionPerformed(ActionEvent e)
      {   M1 m=new M1();  
         Button k=(Button)e.getSource();
       if(k.getLabel()==""&&f==0)
         {
         if(a=='O')
             { k.setLabel("O") ;
               a='X';
             }
         else
                 {        k.setLabel("X");
                          a='O';
                   }
       c++;
      if(c>4)
        {        if(b1.getLabel()==b2.getLabel()&&b2.getLabel()==b3.getLabel())
                  {  if(b1.getLabel()!="")
                      { 
                           m.win();
                      }
                   }
 else if(b4.getLabel()==b5.getLabel()&&b5.getLabel()==b6.getLabel()) 
                   {   
              if(b4.getLabel()!="")
                       { m.win();
                       }}
 else if(b7.getLabel()==b8.getLabel()&&b8.getLabel()==b9.getLabel()) 
                    { if(b7.getLabel()!="")
                       {  m.win();

                    
                       }}
 else if(b1.getLabel()==b4.getLabel()&&b4.getLabel()==b7.getLabel()) 
                    { if(b1.getLabel()!="")
                       {  m.win();
                   
                       }}
 else if(b2.getLabel()==b5.getLabel()&&b5.getLabel()==b8.getLabel()) 
                    { if(b2.getLabel()!="")
                       {  m.win();
                             
                       }}
 else if(b3.getLabel()==b6.getLabel()&&b6.getLabel()==b9.getLabel()) 
                    { if(b3.getLabel()!="")
                       {  m.win();
                       }}
 else if(b1.getLabel()==b5.getLabel()&&b5.getLabel()==b9.getLabel()) 
                    { if(b1.getLabel()!="")
                       {  m.win();
                       }}
 else if(b3.getLabel()==b5.getLabel()&&b5.getLabel()==b7.getLabel()) 
                    { if(b3.getLabel()!="")
                       {  m.win();
                           
                       }
      
                   }
}
     }  
  }    
 }
}